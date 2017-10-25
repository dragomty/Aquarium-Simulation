package Behaviours;
import Animals.IToken;
import java.util.Random;//import random to randomizes taken from website http://www.javapractices.com/topic/TopicAction.do?Id=62
import java.lang.String;


/**
 * Write a description of class UrchinBehaviour here.
 * 
 * @author Justin 
 * @version (9)
 */
public class UrchinBehaviour extends Behaviour
{
    
   // position in to be placed at in 3D world (x,y,z coordinates):
   private double x=1.0, y=1.0, z=1.0;
    
    // orientation to be placed at in 3D world (about x,y,z):
   private double rotateX=0, rotateY=-90, rotateZ=0;
   

  

    /**
     * Constructor for objects of class UrchinBehaviour
     * @param BehaviourToken,xpos,ypos,xRot,yRot,zRot
     * 
     */
    public UrchinBehaviour(IToken BehaviourToken,double ypos,double xRot, double yRot, double zRot)
    {
        super(BehaviourToken);
        // initialise instance variables
        this.x = _randomPos;;
        this.y = ypos;
        this.rotateX = xRot;
        this.rotateY = yRot;
        this.rotateZ = zRot;
       
    }

    /**
     * Urchin move method that makes it rotate at the bottom of the aquarium.
     * 
     * @param  none
     * @return none
     */
   public void move()
    {
       // INCREMENT orientation value with the value of speed
       x += _speed;//apply speed to our urchin
       this.rotateX += 0.5;////apply the rotation to our urchin
       
         
       //IF statement if our urchin reaches border on either left or right, it should bounce and change the rotation.
       
       if(( x >= 8.9)||(x <= 0.9))
       {
        _speed *= -1; 
       this.rotateY = -rotateY;
       }
        
        super.move (x,y,rotateX, rotateY, rotateZ);
    }
    
     
}
