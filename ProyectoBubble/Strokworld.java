import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase , es clase mundo del Juego.
 * 
 * @author Los tres Mosqueteros
 * @version 1.0 beta
 */
public class Strokworld extends World 
{
    public final int TIEMPO_NIVEL=60;
    private Counter contBurbujas;
    private Counter contTiempo;
    private Counter contVidas;
    private SimpleTimer reloj;
    private SimpleTimer relojworm;
    private Burbuja1 burbuja;
    private vida vida;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Strokworld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        contBurbujas = new Counter("Puntaje: ");
        addObject(contBurbujas,58,22);
        contVidas = new Counter("Vidas: ");
        addObject(contVidas,285,22);
        contVidas.setValue(3);
        Conel conel = new Conel();
        addObject(conel,322,375);
        Burbuja1 burbuja1 = new Burbuja1();
        addObject(burbuja1,289,109);

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
           Greenfoot.stop();
          Greenfoot.setWorld(new GameOver());  
        }
    }
    
    public void incrementaPuntaje()
    {
        contBurbujas.add(1);
        
        if(contBurbujas.getValue()==7){
            Label etiquetaWINNER = new Label("WINNER:Conel",55);
            addObject(etiquetaWINNER,350,250);
            Greenfoot.stop();
            Greenfoot.setWorld(new Nivel2());

        }
    }
    
    public void decrementaVidas()
    {
        contVidas.add(-1);
       removeObject(vida);
       
    }
    
    public void conelAtrapado(){
        decrementaVidas();
       
       if(contVidas.getValue()==0)
       {   
           contVidas.setValue(0);
           Greenfoot.stop();
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
