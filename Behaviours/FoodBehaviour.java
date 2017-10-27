package Behaviours;
import Animals.IToken;
import java.util.Random;
import java.lang.String;

/**
 * class for the food behaviour
 * 
 * @author Justin 
 * @version (0)
 */
public class FoodBehaviour extends Behaviour
{
   // position in to be placed at in 3D world (x,y,z coordinates):
   private double x=3.0, y=6.0, z=1.0;
   
    // orientation to be placed at in 3D world (about x,y,z):
   private double rotateX=0, rotateY=-90, rotateZ=0;

   
   
   
    /**
     * Constructor for objects of class FoodBehaviour
     */
    public FoodBehaviour(IToken BehaviourToken, double xRot, double yRot, double zRot)
    {
        // initialise instance variables
        super(BehaviourToken);///calling parent class 
        this.rotateX = xRot;
        this.rotateY = yRot;
        this.rotateZ = zRot;
    }
    
    /**
     * Constructor for objects of class FoodBehaviour
     */
    public FoodBehaviour(IToken BehaviourToken, double xpos, double ypos, double xRot, double yRot, double zRot)
    {
        // initialise instance variables
        super(BehaviourToken);///calling parent class
        this.x = xpos;
        this.y = ypos;  
        this.rotateX = xRot;
        this.rotateY = yRot;
        this.rotateZ = zRot;
        _speed = 0.004;//overriding speed
    }

    /**
     * A movement method for food
     * @param none
     * @return none
     */
    
    public void move()
    {
       y -= _speed;//applies our speed to y axis
       
       
       
       super.move(x,y,rotateX, rotateY, rotateZ);
      
    }
    
}
