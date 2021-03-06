import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import  java.util.List;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import  java.util.ListIterator;  
/**
 * Write a description of class Nivel5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nivel5 extends Strokworld
{
    private int hab1, hab2, hab3;
    /**
     * Constructor for objects of class Nivel5.
     * 
     */
    
    public Nivel5()
    {  
        Greenfoot.start();
        prepare();
        Greenfoot.delay(100);
    }
    public void act()
    {
        List lista=getObjects(Bowser.class);
        
            if(  lista.size()==0){
             Label etiquetaFin = new Label("WINNER",55);
             addObject(etiquetaFin,250,250);
             Greenfoot.stop();
             Greenfoot.setWorld(new Win());
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
            Greenfoot.setWorld(new Win());
        }
        
        
    }
    
    private void prepare()
    {

        Plataforma plataforma = new Plataforma();
        addObject(plataforma,555,77);
        Plataforma plataforma2 = new Plataforma();
        addObject(plataforma2,58,81);
        PlataformaMov plataformamov = new PlataformaMov();
        addObject(plataformamov,305,134);
        PlataformaMov plataformamov2 = new PlataformaMov();
        addObject(plataformamov2,463,211);
        PlataformaMov plataformamov3 = new PlataformaMov();
        addObject(plataformamov3,158,220);
        PlataformaMov plataformamov4 = new PlataformaMov();
        addObject(plataformamov4,316,293);
        Plataforma plataforma3 = new Plataforma();
        addObject(plataforma3,557,371);
        Plataforma plataforma4 = new Plataforma();
        addObject(plataforma4,57,378);
        Bowser bowser = new Bowser();
        addObject(bowser,302,97);
        bowser.setLocation(310,254);
        bowser.setLocation(304,97);
    }
    
    
}
