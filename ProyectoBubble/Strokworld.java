import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase , es clase mundo del Juego.
 * 
 * @author Los tres Mosqueteros
 * @version 1.0 beta
 */
public class Strokworld extends World
{
    public final int TIEMPO_NIVEL=200;
    private Counter contBurbujas;
    private Counter contTiempo;
    private SimpleTimer reloj;
    private SimpleTimer relojworm;
   
    
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Strokworld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        contBurbujas = new Counter("Puntaje: ");
        addObject(contBurbujas,57,15);
        
        prepare();
        contTiempo.setValue(TIEMPO_NIVEL);
        reloj=new SimpleTimer();
        relojworm=new SimpleTimer();
        
    }

     public void act(){
         
        
         if(reloj.millisElapsed()>1000){
        contTiempo.add(-1);
        reloj.mark();
    }
        
        if(contTiempo.getValue()==0){
           Label etiquetaTiempoFin = new Label("Tiempo Agotado",65);
           addObject(etiquetaTiempoFin,329,249);
           Greenfoot.stop();
        }
    }
    
    public void incrementaPuntaje()
    {
        contBurbujas.add(1);
  
        if(contBurbujas.getValue()==100){
            Label etiquetaWINNER = new Label("WINNER:Conel",55);
            addObject(etiquetaWINNER,350,250);
  
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
        addObject(conel,222,375);
        Burbuja1 burbuja1 = new Burbuja1();
        addObject(burbuja1,187,87);
        contTiempo = new Counter("Tiempo:");
        addObject(contTiempo,533,23);
    }
    public void disparaarma(int xmouse,int x,int ymouse, int y)
    {
        Bala bala1=new Bala(xmouse,ymouse);
         addObject(bala1,x,y);
       /*  
        System.out.println("X del mouse:");
        System.out.println(xmouse);
        System.out.println("Y del mouse");
        System.out.println(ymouse);
        System.out.println("X inicial");
        System.out.println(x);
        System.out.println("Y inicial");
        System.out.println(y);
        */
        
    }
    
    
}
