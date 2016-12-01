import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
        MinBurbuja minburbuja = new MinBurbuja();
        addObject(minburbuja,142,128);
        MinBurbuja minburbuja2 = new MinBurbuja();
        addObject(minburbuja2,465,141);
        MiniBurbujita miniburbujita = new MiniBurbujita();
        addObject(miniburbujita,401,66);
        MiniBurbujita miniburbujita2 = new MiniBurbujita();
        addObject(miniburbujita2,191,63);
        MiniBurbujita miniburbujita3 = new MiniBurbujita();
        addObject(miniburbujita3,209,182);
        MiniBurbujita miniburbujita4 = new MiniBurbujita();
        addObject(miniburbujita4,412,169);
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
        removeObject(miniburbujita3);
        removeObject(miniburbujita4);
    }
}
