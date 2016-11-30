import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nivel5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nivel5 extends Strokworld
{

    /**
     * Constructor for objects of class Nivel5.
     * 
     */
    GreenfootSound musicafondo = new GreenfootSound("nivel5.mp3");
    public Nivel5()
    {  
        prepare();
    }
    public void act()
    {
        if(!musicafondo.isPlaying())
        {
            musicafondo.playLoop();
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
        addObject(bowser,147,123);
        bowser.setLocation(310,254);
    }
    
    public void apagamusica()
    {
        musicafondo.stop();
    }
}
