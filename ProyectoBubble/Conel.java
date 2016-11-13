import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Conel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Conel extends Actor
{
    /**
     * Act - do whatever the Conel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public final int GRAVEDAD=5;
     public final int MOV=2;
     public final int SALTO=5;
     
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(),getY()-SALTO);  
        }
        
        if(Greenfoot.isKeyDown("left"))
        {
            setImage("conel_opt2.png");
            setLocation(getX()-MOV,getY());
        }
        
        if(Greenfoot.isKeyDown("right"))
        {
            setImage("conel_opt.png");
            setLocation(getX()+MOV,getY());
        }
        
        if(getY()<=380 && !Greenfoot.isKeyDown("up"))
        {
             setLocation(getX(),getY()+GRAVEDAD);
        }
        explocion();
    }
    
    public void explocion(){
        if(isTouching(Burbuja.class))
        {
         removeTouching(Burbuja.class);   
         setImage("conel_opt.png");
         setLocation(getX(),getY()+GRAVEDAD);
        }
    }
}
