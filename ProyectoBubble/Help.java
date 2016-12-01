import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Help here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Help extends Actor
{
    private int velX;
    private int velY = 1;
    /**
     * Act - do whatever the Help wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Help()
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
        if(getX()<=50 || getX() >= 550 || isTouching(Start.class) || isTouching(Exit.class))
        {
            velX = -velX;
        } 
        if(getY()<=50 || getY() >= 350 || isTouching(Start.class) || isTouching(Exit.class))
        {
            velY = -velY;
        }
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new HelpWorld());
        }
    }    
}
