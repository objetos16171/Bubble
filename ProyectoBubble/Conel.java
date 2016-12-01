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
     private int arma=0;
     private int mun_misil=4;
     private int mun_laser=8;
     private int mun_escopeta=10;
     
    
     
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
        
        if(Greenfoot.isKeyDown("Y"))
        {
            arma=0;
        }
        if(Greenfoot.isKeyDown("U"))
        {
            arma=1;
            
            if(mun_laser<=0)
            { 
                arma=0;
            }
        }
        if(Greenfoot.isKeyDown("I"))
        {
            arma=2;
            if(mun_escopeta<=0)
            { 
                arma=0;
            }
        }
        if(Greenfoot.isKeyDown("O"))
        {
            arma=3;
            if(mun_misil<=0)
            { 
                arma=0;
            }
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
            {         if(arma==1)
                        {
                            mun_laser=mun_laser-1;
                      }
                      if(arma==2)
                        {
                            mun_escopeta=mun_escopeta-1;
                      }
                      if(arma==3)
                        {
                            mun_misil=mun_misil-1;
                      }
                     ((Strokworld)mundo).disparaarma(mouse.getX(),getX(),mouse.getY(),getY(),arma);
            }
        }
}
}
