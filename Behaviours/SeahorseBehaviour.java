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
   // instance variables - replace the example below with your own
    
   // position in to be placed at in 3D world (x,y,z coordinates):
   private double x=1.0, y=1.0, z=1.0;
    
    // orientation to be placed at in 3D world (about x,y,z):
   private double rotateX=0, rotateY=-90, rotateZ=0;
   
   
  

    /**
     * Constructor for objects of class OrangeFishBehaviour
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
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
   public void move()
    {
       // INCREMENT orientation value with the value of speed
       x += _speed;//apply speed
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
