import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase , es clase mundo del Juego.
 * 
 * @author Los tres Mosqueteros
 * @version 1.0 beta
 */
public class Strokworld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Strokworld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Burbuja burbuja = new Burbuja();
        addObject(burbuja,297,72);
    }
}
