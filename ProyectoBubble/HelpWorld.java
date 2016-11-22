import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HelpWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HelpWorld extends World
{

    /**
     * Constructor for objects of class HelpWorld.
     * 
     */
    public HelpWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    public void HelpWorld()
    {
        if(Greenfoot.isKeyDown("esc"))
        {
            Greenfoot.setWorld(new Menu());
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Back back = new Back();
        addObject(back,556,358);
        back.setLocation(560,359);
    }
}
