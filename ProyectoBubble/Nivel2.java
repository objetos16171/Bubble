import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nivel2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nivel2 extends Strokworld 
{
    /**
     * Constructor for objects of class Nivel2.
     * 
     */
    public Nivel2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
      Greenfoot.start();
        prepare();
        
    }
        
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Plataforma plataforma = new Plataforma();
        addObject(plataforma,305,224);
        Plataforma plataforma2 = new Plataforma();
        addObject(plataforma2,55,304);
        Plataforma plataforma3 = new Plataforma();
        addObject(plataforma3,557,299);
        plataforma2.setLocation(55,335);
        plataforma3.setLocation(550,270);
        plataforma.setLocation(285,230);
        removeObject(plataforma);
        plataforma3.setLocation(552,216);
    }

}