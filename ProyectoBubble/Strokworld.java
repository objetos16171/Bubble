import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase , es clase mundo del Juego.
 * 
 * @author Los tres Mosqueteros
 * @version 1.0 beta
 */
public class Strokworld extends World
{
    public final int TIEMPO_NIVEL=15;
    private Counter contTiempo;
    private SimpleTimer reloj;
    private SimpleTimer relojworm;
    
    private int f;
    private int i;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Strokworld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        prepare();
        contTiempo.setValue(TIEMPO_NIVEL);
        reloj=new SimpleTimer();
        relojworm=new SimpleTimer();
        f=0;
    }

     public void act(){
         if(reloj.millisElapsed()>1000){
        contTiempo.add(-1);
        reloj.mark();
        f++;
    }
        
        if(contTiempo.getValue()==0){
           Label etiquetaTiempoFin = new Label("Tiempo Agotado",55);
           addObject(etiquetaTiempoFin,249,249);
           Greenfoot.stop();
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Conel conel = new Conel();
        addObject(conel,222,341);
        Burbuja1 burbuja1 = new Burbuja1();
        addObject(burbuja1,187,87);
        contTiempo = new Counter("Tiempo:");
        addObject(contTiempo,533,23);
    }
    
    
}
