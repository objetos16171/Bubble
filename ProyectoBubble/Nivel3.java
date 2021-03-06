import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import  java.util.List;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import  java.util.ListIterator;  
/**
 * Write a description of class Nivel3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nivel3 extends Strokworld
{
    private int hab1, hab2, hab3;
    public Nivel3()
    {
        Greenfoot.start();
        prepare();
        Greenfoot.delay(100);
    }
    
    public void act()
    {
        List lista=getObjects(MiniBurbujita.class);
        
            if(  lista.size()==0){
             Label etiquetaFin = new Label("WINNER",55);
             addObject(etiquetaFin,250,250);
             Greenfoot.stop();
             Greenfoot.setWorld(new Nivel4());
            }
        hab1 = hab2 = hab3 = Greenfoot.getRandomNumber(5000);
        
        if(hab1 == 25 || Greenfoot.isKeyDown("J"))
        {
            vida vidaE = new vida();
            addObject(vidaE,Greenfoot.getRandomNumber(600),75);
        }
        if(hab2 == 35 || Greenfoot.isKeyDown("K"))
        {
            Jet jet = new Jet();
            addObject(jet,Greenfoot.getRandomNumber(600),75);
        }
        if(Greenfoot.isKeyDown("R"))
        {
            Greenfoot.setWorld(new Nivel4());
        }
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
