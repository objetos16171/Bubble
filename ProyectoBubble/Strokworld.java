import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import  java.util.List;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import  java.util.ListIterator;  

/**
 * Esta clase , es clase mundo del Juego.
 * 
 * @author Los tres Mosqueteros
 * @version 1.0 beta
 */
public class Strokworld extends World 
{
    public final int TIEMPO_NIVEL=60;
    private int hab1, hab2, hab3;
    private int hay1, hay2, hay3;
    private Counter contBurbujas;
    private Counter contTiempo;
    private Counter contVidas;
    private SimpleTimer reloj;
    private SimpleTimer relojworm;
    private Burbuja1 burbuja;
    private vida vida;
    
    GreenfootSound musicafondo = new GreenfootSound("musicajuego.mp3");

    public Strokworld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        contBurbujas = new Counter("Puntaje: ");
        addObject(contBurbujas,58,22);
        contVidas = new Counter("Vidas: ");
        //addObject(contVidas,285,22);
        contVidas.setValue(3);
        Conel conel = new Conel();
        addObject(conel,322,375);
        
        //contVidas.setImage("3Life2.png");

        prepare();
        contTiempo.setValue(TIEMPO_NIVEL);
        reloj=new SimpleTimer();
        relojworm=new SimpleTimer();
        
    }

     public void act()
     {
        List lista=getObjects(MiniBurbujita.class);
        
            if(  lista.size()==0){
             Label etiquetaFin = new Label("WINNER",55);
             addObject(etiquetaFin,250,250);
             Greenfoot.stop();
             Greenfoot.setWorld(new Nivel2());
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
        /*if(hab3 == 15 || hab3 == 65)
        {
            vida vidaE = new vida();
        }*/
        if(Greenfoot.isKeyDown("R"))
        {
            Greenfoot.setWorld(new Nivel2());
        }
         if(reloj.millisElapsed()>1000)
         {
             contTiempo.add(-1);
             reloj.mark();
        }
        if(contTiempo.getValue()==0)
        {
          Greenfoot.stop();
          Greenfoot.setWorld(new GameOver());  
        }
        if(!musicafondo.isPlaying())
        {
            musicafondo.playLoop();
        }
    }
    
    public void incrementaPuntaje()
    {
        contBurbujas.add(1);
        
        if(contBurbujas.getValue()==117){
            Label etiquetaWINNER = new Label("WINNER:Conel",55);
            addObject(etiquetaWINNER,350,250);
            Greenfoot.stop();
            Greenfoot.setWorld(new Nivel2());

        }
    }
    
    public void hayHabilidad()
    {
        
    }
    
    public void decrementaVidas()
    {
        contVidas.add(-1);
    }
    
    public void vidaExtra()
    {
        if(contVidas.getValue() < 3)
        {
            contVidas.add(1);
        }else
        {
            contVidas.add(0);
        }
    }
    
    public int numVidas()
    {
        return contVidas.getValue();
    }
    
    public void conelAtrapado()
    {
       decrementaVidas();
       
       if(contVidas.getValue()==0)
       {   
           contVidas.setValue(0);
           Greenfoot.stop();
           apagamusica();
           Greenfoot.setWorld(new GameOver());  
            
        }

    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        contTiempo = new Counter("Tiempo:");
        addObject(contTiempo,533,23);
        vida vida = new vida();
        addObject(vida,231,29);
        vida vida2 = new vida();
        addObject(vida2,285,35);
        vida vida3 = new vida();
        addObject(vida3,344,38);
        vida.setLocation(234,19);
        vida2.setLocation(277,20);
        vida3.setLocation(320,20);
        removeObject(vida3);
        removeObject(vida2);
        removeObject(vida);
        Vidas vidas = new Vidas();
        addObject(vidas,297,24);
        vidas.setLocation(288,16);

        MiniBurbujita miniburbujita = new MiniBurbujita();
        addObject(miniburbujita,205,79);
        MiniBurbujita miniburbujita2 = new MiniBurbujita();
        addObject(miniburbujita2,306,189);
        MiniBurbujita miniburbujita3 = new MiniBurbujita();
        addObject(miniburbujita3,399,83);
    }


    public void disparaarma(int xmouse,int x,int ymouse, int y,int arma)
    {
         if(arma==0)
        {
        Bala bala1=new Bala(xmouse,ymouse);
         addObject(bala1,x,y);
        }
        if(arma==1)
        {
            Laser laser1=new Laser(xmouse,ymouse);
            addObject(laser1,x,y);
        }
        if(arma==2)
        {
             Escopeta escopeta1=new Escopeta(xmouse,ymouse);
            addObject(escopeta1,x,y);
        }
        if(arma==3){
             Misil misil1=new Misil(xmouse,ymouse);
            addObject(misil1,x,y);
            
        }
        
    }
    
    public void apagamusica()
    {
        musicafondo.stop();
    }
}
