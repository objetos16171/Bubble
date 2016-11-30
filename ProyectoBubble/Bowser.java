import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bowser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bowser extends Burbuja1
{
    /**
     * Act - do whatever the Bowser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int velX;
    private int velY = 2;
    private SimpleTimer reloj;
    private int vida=100;
    
    
    
    
    public Bowser()
    {
         velX = Greenfoot.getRandomNumber(2) + 1;
        if (Greenfoot.getRandomNumber(2) == 0)
           velX = -1 * velX;
        reloj=new SimpleTimer();
    }
    public void act() 
    {
        if(reloj.millisElapsed()>3000){
        World mundo=getWorld();
           // MiniBurbujita burbujita1 = new MiniBurbujita();
            MiniBurbujita burbujita2 = new MiniBurbujita();

           // ((Nivel5)mundo).addObject(burbujita1,getX()+20,getY()+6);
            ((Nivel5)mundo).addObject(burbujita2,getX()+20,getY()+10); 
        reloj.mark();
        }
        
        
       setLocation(getX()+velX,getY()+velY);
        if(getX()<=50 || getX() >= 550 )
        {
            velX = -velX;
        } 
        if(getY()<=50 || getY() >= 350)
        {
            velY = -velY;
        } 
        
        if(isTouching(Bala.class)){  
            vida=vida-1;         
        }
        
        if(vida<=0)
        {   World mundo1=getWorld();
           ((Nivel5)mundo1).apagamusica();
           Greenfoot.setWorld(new Win());
        }   
        
        
    }    
}
