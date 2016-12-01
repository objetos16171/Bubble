import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Vidas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vidas extends Actor
{
    public void act() 
    {
        World mundo = getWorld();
        if(((Strokworld)mundo).numVidas() == 3)
        {
           setImage("3Life2.png");
        }
        if(((Strokworld)mundo).numVidas() == 2)
        {
           setImage("2Life2.png");
        }
        if(((Strokworld)mundo).numVidas() == 1)
        {
           setImage("1Life2.png");
        }
    }    
}
