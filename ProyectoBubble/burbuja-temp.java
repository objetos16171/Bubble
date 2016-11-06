import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Burbuja here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Burbuja extends Actor
{
     private int velX;
    private int velY = 2;
    
    /**
     * Act - do whatever the burbuja wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public burbuja()
    {
        velX = Greenfoot.getRandomNumber(2) + 1;
        if (Greenfoot.getRandomNumber(2) == 0)
           velX = -1 * velX;
        setRotation(100);
    }
    
    public void act() 
    {
        setLocation(getX()-velX,getY()+velY);
        if(getX()<=0 ||  getX() >= 590)
        {
            velX = -velX;
        } 
        if(getY()>= 390 || getY() <= 0)
        {
            velY = -velY;
        }
    }  
}
