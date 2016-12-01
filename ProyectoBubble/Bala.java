import greenfoot.*; 
import java.lang.Math; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import  java.util.List;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import  java.util.ListIterator;  

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
     private int dirx;
     private int diry;
     private int vel=3;
     private int bandera=1;
     
     World mundo=getWorld();
     
     
    public Bala(int x,int y)
    {
    super();
    dirx=x;
    diry=y;
    
    
    
    }
    
        
    public void act() 
    {   
        turnTowards(dirx,diry);

        if(isTouching(Burbuja1.class))
        {
            removeTouching(Burbuja1.class);
            World mundo = getWorld();
            ((Strokworld)mundo). incrementaPuntaje();
        }
        if(isTouching(MinBurbuja.class))
        {
           removeTouching(MinBurbuja.class); 
           World mundo = getWorld();
           ((Strokworld)mundo). incrementaPuntaje();
        }           
        if(isTouching(MinBurbuja.class)){
                removeTouching(MiniBurbujita.class);
                ((Strokworld)mundo). incrementaPuntaje();
        }
        
        
        
        
        if(getX()> 590 || getX()< 10 || getY()> 390 || getY()< 10 )
        {
          remuevebala();
         
        }
        if(getX()<=(dirx+10) && getX()>=(dirx-10) )
        {
            if( getY()<=(diry+10) && getY()>=(diry-10) )
            {
                if(bandera==1)
                {
                    remuevebala();
                    bandera=0;
                  }
            
        
            }
        }
       move(vel); 
    } 


    public void remuevebala()
    {
        World mundo=getWorld();
          ((Strokworld)mundo).removeObject(this);
    }
}