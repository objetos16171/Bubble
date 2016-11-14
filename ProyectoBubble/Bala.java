import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bala here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class Bala extends Actor
{
    /**
     * Act - do whatever the Bala wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
     private int dir;
     private int vel=3;
     
     World mundo=getWorld();
     
     
    public Bala(int direccion)
    {
    super();
    dir=direccion;
    if(dir==1)
    {setRotation(270);
    }
    if(dir==2)
    {setRotation(180);
    }
    if(dir==4)
    {setRotation(225);
    }
    if(dir==5)
    {setRotation(315);
    }
    
    
    }
    
        
    public void act() 
    {
        // Add your action code here.
        if(dir==1)
        {
         setLocation(getX(),getY()-vel);
        }
        if(dir==2)
        {
         setLocation(getX()-vel,getY());
        }
         if(dir==3)
        {
         setLocation(getX()+vel,getY());
        }
        if(dir==4)
        {
         setLocation(getX()-vel,getY()-vel);
        }
        if(dir==5)
        {
         setLocation(getX()+vel,getY()+vel);
        }
        
        if(getX()> 590 || getX()< 10 || 
        getY()> 390 || getY()< 10)
        {
          World mundo=getWorld();
          ((Strokworld)mundo).removeObject(this);
        }
    }    
}
