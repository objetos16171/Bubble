import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import  java.util.List;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import  java.util.ListIterator;  
/**
 * Write a description of class Nivel2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nivel2 extends Strokworld 
{
    private int hab1, hab2, hab3;
    public Nivel2()
    {
        prepare();
        Greenfoot.start();
        Greenfoot.delay(100);
    }
    
    public void act()
    {
        
        List lista=getObjects(MiniBurbujita.class);
        
            if(  lista.size()==0){
             Label etiquetaFin = new Label("WINNER",55);
             addObject(etiquetaFin,250,250);
             Greenfoot.stop();
             Greenfoot.setWorld(new Nivel3());
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
            Greenfoot.setWorld(new Nivel3());
        }
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
        Escalera escalera = new Escalera();
        addObject(escalera,563,358);
        escalera.setLocation(560,351);
        Escalera escalera2 = new Escalera();
        addObject(escalera2,495,262);
        Escalera escalera3 = new Escalera();
        addObject(escalera3,192,323);
        escalera2.setLocation(560,254);
        escalera3.setLocation(63,354);
        plataforma2.setLocation(62,310);
        plataforma3.setLocation(552,210);

        Burbuja1 burbuja1 = new Burbuja1();
        addObject(burbuja1,303,119);
        burbuja1.setLocation(287,99);
    }

}