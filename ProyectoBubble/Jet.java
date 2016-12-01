import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jet extends Actor
{
    int GRAVEDAD = 1;
    public void act() 
    {
        if(isTouching(Conel.class))
        {
            World mundo = getWorld();
            mundo.removeObject(this);
        }
        /*if(getY()<=380)
        {
             setLocation(getX(),getY()+GRAVEDAD);
        }*/
    }
}
