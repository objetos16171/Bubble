import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Burbuja1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Burbuja1 extends Actor
{
   private int velX;
    private int velY = 2;
    
    /**
     * Act - do whatever the Burbuja wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Burbuja1()
    {
        velX = Greenfoot.getRandomNumber(2) + 1;
        if (Greenfoot.getRandomNumber(2) == 0)
           velX = -1 * velX;
    }
    public void act() 
    {
       setLocation(getX()+velX,getY()+velY);
        if(getX()<=50 || getX() >= 550)
        {
            velX = -velX;
        } 
        if(getY()<=50 || getY() >= 350)
        {
            velY = -velY;
        } 
        
        if(isTouching(Bala.class)){  
            
            World mundo=getWorld();
            MinBurbuja burbujita1 = new MinBurbuja();
            MinBurbuja burbujita2 = new MinBurbuja();

            ((Strokworld)mundo).addObject(burbujita1,getX()+20,getY()+6);
            ((Strokworld)mundo).addObject(burbujita2,getX()+20,getY()+10);         
        }
        
        if (isTouching(Conel.class))
       {
           removeTouching(Conel.class);
           World mundo = getWorld();
           ((Strokworld)mundo).conelAtrapado();
           Conel conel = new Conel ();
           ((Strokworld)mundo).addObject(conel,getX()+200,getY());
        
       }
    }  
}
