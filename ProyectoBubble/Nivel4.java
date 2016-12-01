import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import  java.util.List;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import  java.util.ListIterator;  
/**
 * Write a description of class Nivel4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nivel4 extends Strokworld
{
    private int hab1, hab2, hab3;
    public Nivel4()
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
             Greenfoot.setWorld(new Nivel5());
            }
        hab1 = hab2 = hab3 = Greenfoot.getRandomNumber(5000);
        
        if(hab1 == 25)
        {
            vida vidaE = new vida();
            addObject(vidaE,Greenfoot.getRandomNumber(600),375);
        }
        if(hab2 == 35)
        {
            Jet jet = new Jet();
            addObject(jet,Greenfoot.getRandomNumber(600),375);
        }
        if(Greenfoot.isKeyDown("R"))
        {
            Greenfoot.setWorld(new Nivel5());
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Plataforma plataforma = new Plataforma();
        addObject(plataforma,547,351);
        Plataforma plataforma2 = new Plataforma();
        addObject(plataforma2,51,362);
        Plataforma plataforma3 = new Plataforma();
        addObject(plataforma3,548,187);
        Plataforma plataforma4 = new Plataforma();
        addObject(plataforma4,73,198);
        plataforma4.setLocation(58,195);
        PlataformaMov plataformamov = new PlataformaMov();
        addObject(plataformamov,297,274);

        MinBurbuja minburbuja = new MinBurbuja();
        addObject(minburbuja,310,89);
        MinBurbuja minburbuja2 = new MinBurbuja();
        addObject(minburbuja2,532,96);
        removeObject(minburbuja2);
        removeObject(minburbuja);
        MinBurbuja minburbuja3 = new MinBurbuja();
        addObject(minburbuja3,301,97);
    }
}
