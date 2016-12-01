import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class vida here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class vida extends Actor
{
    int GRAVEDAD = 1;
    public void act() 
    {
        if(getY()<=380)
        {
             setLocation(getX(),getY()+GRAVEDAD);
        }
        if(isTouching(Conel.class))
        {
            World mundo = getWorld();
            ((Strokworld)mundo).vidaExtra();
            ((Strokworld)mundo).removeObject(this);
        }
    }    
}
