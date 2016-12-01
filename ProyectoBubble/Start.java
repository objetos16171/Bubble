import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends Actor
{
    private int velX;
    private int velY = 1;
    /**
     * Act - do whatever the Start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Start()
    {
        velX = 1;
        
        if (Greenfoot.getRandomNumber(2) == 0)
        {
            velX = -1 * velX;
        }
    }
    
    public void act() 
    {
        //turn(-1);
        setLocation(getX()+velX,getY()+velY);
        if(getX()<=50 || getX() >= 550 || isTouching(Help.class) || isTouching(Exit.class))
        {
            velX = -velX;
        } 
        if(getY()<=50 || getY() >= 350 || isTouching(Help.class) || isTouching(Exit.class))
        {
            velY = -velY;
        }
        if(Greenfoot.mouseClicked(this))
        {
            World mundo1=getWorld();
           ((Menu)mundo1).apagamusica();
            Greenfoot.setWorld(new Strokworld());
        }
    }    
}
