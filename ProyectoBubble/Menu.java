import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{

    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /*public void Select()
    {
        if(Greenfoot.mouseClicked(Start.class))
        {
            
        }
        if(Greenfoot.mouseClicked(Help.class))
        {
            Greenfoot.setWorld(new HelpWorld());
        }
        if(Greenfoot.mouseClicked(Exit.class))
        {
            
        }
    }*/

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Start start = new Start();
        addObject(start,319,268);
        Exit exit = new Exit();
        addObject(exit,508,273);
        Help help = new Help();
        addObject(help,115,277);
        help.setLocation(101,287);
        start.setLocation(294,218);
        exit.setLocation(494,298);
    }
}
