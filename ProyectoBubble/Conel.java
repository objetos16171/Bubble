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
     public final int GRAVEDAD=8;
     public final int MOV=4;
     public final int SALTO=10;
     private String conelI = "conel_opt2.png";
     private String conelD = "conel_opt.png";
     private MouseInfo mouse;
     private int infox;
     private int infoy;
     
    
     
    public void act() 
    {
        // Add your action code here.
        if(conelD != "conel_opt.png" && Greenfoot.isKeyDown("W") || isTouching(Escalera.class) && Greenfoot.isKeyDown("W"))
        {
            if(conelD == "conel_opt_jet.png")
            {
                conelD = "conel_opt_jetfire.png";
                conelI = "conel_opt_jetfire2.png";
            }
            setLocation(getX(),getY()-SALTO);  
        }
        
        if(Greenfoot.isKeyDown("A"))
        {
            setImage(conelI);
            setLocation(getX()-MOV,getY());
        }
        
        if(Greenfoot.isKeyDown("D"))
        {
            setImage(conelD);
            setLocation(getX()+MOV,getY());
        }
        
        if(getY()<=380 && !Greenfoot.isKeyDown("up") && !isTouching(Plataforma.class) && !isTouching(PlataformaMov.class))
        {
             setLocation(getX(),getY()+GRAVEDAD);
        }

       
        
        if(getY() > 380 && conelD == "conel_opt_jetfire.png")
        {
            conelI = "conel_opt_jet2.png";
            conelD = "conel_opt_jet.png";
        }
        
        if(isTouching(Jet.class))
        {
            conelD = "conel_opt_jet.png";
            conelI = "conel_opt_jet2.png";
        }
        
        mouse=Greenfoot.getMouseInfo();
        if(mouse !=null)
        {   World mundo=getWorld();
            if(mouse.getClickCount()==1)
            {                 
                     ((Strokworld)mundo).disparaarma(mouse.getX(),getX(),mouse.getY(),getY());
            }
        }
}
}
