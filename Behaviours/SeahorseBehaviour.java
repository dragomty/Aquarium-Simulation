package Behaviours;
import Behaviours.*;
import Animals.*;

/**
 * SeahorseBehaviour class responsible for seahorse movement.
 * 
 * @author Justin 
 * @version 0
 */
public class SeahorseBehaviour extends Behaviour
{
  
   // position in to be placed at in 3D world (x,y,z coordinates):
   private double x=1.0, y=1.0, z=1.0;
    
    // orientation to be placed at in 3D world (about x,y,z):
   private double rotateX=0, rotateY=-90, rotateZ=0;
   
   
  

    /**
     * Constructor for objects 
     * @param BehaviourToken,xpos,ypos,yRot,yRot,zRot
     * 
     */
    public SeahorseBehaviour(IToken BehaviourToken, double xRot, double yRot, double zRot)
    {
        super(BehaviourToken);//calling parent class
        // initialise instance variables
        this.x = _randomPos;
        this.y = _randomPos;;
        this.rotateX = xRot;
        this.rotateY = yRot;
        this.rotateZ = zRot;
       
    }

    /**
     * 
     * 
     * @param  
     * @return     
     */
   public void move()
    {
       // INCREMENT orientation value with the value of speed
       x += _speed;//apply x speed
       y += _speed;//apply y speed
       
         
       //IF statements for seahorse movement and applies y direction and makes it move on y axis.
       
       if(( x >= 9.5)||(x <= 0.5))
       {
        _speed *= -1; 
       this.rotateY = -rotateY;
        
       
       }
       
        if(( y >= 7.0)||( y <= 1.0))
       {
        _speed *= -1; 
       this.rotateY = -rotateY;
        
       
       }
        
        super.move (x,y,rotateX, rotateY, rotateZ);
    }
    
     
}
