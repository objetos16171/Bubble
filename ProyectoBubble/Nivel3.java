import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nivel3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nivel3 extends Strokworld
{

    /**
     * Constructor for objects of class Nivel3.
     * 
     */
    public Nivel3()
    {
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        MinBurbuja minburbuja = new MinBurbuja();
        addObject(minburbuja,196,125);
        MinBurbuja minburbuja2 = new MinBurbuja();
        addObject(minburbuja2,439,133);
        minburbuja.setLocation(165,139);
        PlataformaMov plataformamov = new PlataformaMov();
        addObject(plataformamov,59,305);
        PlataformaMov plataformamov2 = new PlataformaMov();
        addObject(plataformamov2,547,185);
    }
}
