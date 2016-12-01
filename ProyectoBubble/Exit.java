import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Exit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Exit extends Actor
{
    private int velX;
    private int velY = 1;
    /**
     * Act - do whatever the Exit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Exit()
    {
        velX = 1;
        
        if (Greenfoot.getRandomNumber(2) == 0)
        {
            velX = -1 * velX;
        }
    }
    
    public void act() 
    {
        //turn(1);
        setLocation(getX()+velX,getY()+velY);
        if(getX()<=50 || getX() >= 550 || isTouching(Help.class) || isTouching(Start.class))
        {
            velX = -velX;
        } 
        if(getY()<=50 || getY() >= 350 || isTouching(Help.class) || isTouching(Start.class))
        {
            velY = -velY;
        }
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.stop();
        }
    }    
}
