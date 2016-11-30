import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nivel2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nivel2 extends Strokworld 
{
    public final int TIEMPO_NIVEL=200;
    private Counter contBurbujas;
    private Counter contTiempo;
    private Counter contVidas;
    private SimpleTimer reloj;
    
    private SimpleTimer relojworm;
    /**
     * Constructor for objects of class Nivel2.
     * 
     */
    public Nivel2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
      
        contBurbujas = new Counter("Puntaje: ");
        addObject(contBurbujas,58,22);
        contVidas = new Counter("Vidas: ");
        addObject(contVidas,285,22);
        contVidas.setValue(3);
        
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
       
    }
    
    public void conelAtrapado(){
        decrementaVidas();
       
       if(contVidas.getValue()==0)
       {
            contVidas.setValue(0);
            Label etiquetaFin = new Label("Game Over",55);
            addObject(etiquetaFin,250,250);
            Greenfoot.stop();
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
        contTiempo = new Counter("Tiempo:");
        addObject(contTiempo,533,23);
        plataforma2.setLocation(55,335);
        plataforma3.setLocation(550,270);
        plataforma.setLocation(285,230);
        removeObject(plataforma);
        plataforma3.setLocation(552,216);
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