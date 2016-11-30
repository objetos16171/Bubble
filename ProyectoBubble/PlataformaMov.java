import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlataformaMov here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlataformaMov extends Actor
{
    /**
     * Act - do whatever the PlataformaMov wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int velX = -2;
    
    public void act()
    {
        move(velX);
        if(getX() < 40 || isTouching(Plataforma.class) || getX() > 560)
        {
            if(velX == 2)
            {
                velX = -2;
            }else
            {
                velX = 2;
            }
        }
    }    
}
