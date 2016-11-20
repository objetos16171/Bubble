import greenfoot.*; 
import java.lang.Math; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
     
     World mundo=getWorld();
     
     
    public Bala(int x,int y)
    {
    super();
    
    turnTowards(x,y);
    int rot;
    rot=getRotation();
    turn(-rot);
    turn(((rot)*4)-90);
    
    System.out.println(getRotation());
    
    }
    
        
    public void act() 
    {
        ////////////////////////////////////////////////////////////////
        if(isTouching(Burbuja1.class)|| isTouching(MinBurbuja.class)|| isTouching(MiniBurbujita.class)){
            removeTouching(Burbuja1.class);   
            removeTouching(MinBurbuja.class);
            removeTouching(MiniBurbujita.class);
           
            World mundo = getWorld();
            ((Strokworld)mundo). incrementaPuntaje();
        }
        
        
        
        
        if(getX()> 590 || getX()< 10 || 
        getY()> 390 || getY()< 10)
        {
          World mundo=getWorld();
          ((Strokworld)mundo).removeObject(this);
        }
        move(vel);
    } 
}
