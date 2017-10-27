package Behaviours;
import Animals.IToken;
import java.util.Random;//import random to randomizes taken from website http://www.javapractices.com/topic/TopicAction.do?Id=62
import java.lang.String;

/**
 * A class for the piranha behaviour. Responsible for movement and positioning.
 * 
 * @author Justin
 * @version 0
 */
public class PiranhaBehaviour extends Behaviour
{
    // instance variables - replace the example below with your own
 
   // position in to be placed at in 3D world (x,y,z coordinates):
   private double x=1.0, y=1.0, z=1.0;
    
    // orientation to be placed at in 3D world (about x,y,z):
   private double rotateX=0, rotateY=-90, rotateZ=0;
 
    
   
   

    /**
     * Constructor for objects of class PiranhaBehaviour
     * @param BehaviourToken,xRot,yRot,zRot
     *  
     */
    public PiranhaBehaviour(IToken BehaviourToken, double xRot, double yRot, double zRot)
    {
        super(BehaviourToken);///calling parent class
        // initialise instance variables
        this.x = _randomPos;///////////
        this.y = _randomPos;////////////////////
        this.rotateX = xRot;
        this.rotateY = yRot;
        this.rotateZ = zRot;
             
    }
    
    /**
     * testing method
     * 
     * 
     */
     public Double[] position()///taken from week 11
    {
        Double positionVal[] = {x, y, z};
        return positionVal;
    }
          
    /**
     * making the random position accesible to piranha
     * 
     */
    public double BrndPosition()
    {
        double BrndPos = _randomPos;
        return _randomPos;
        
    }
    
  
    /**
     * A movement method for piranha
     * 
     * @param none
     * @return none
     */
    
    public void move()
    {
       x += _speed;//applies our speed to x axis
       
       //IF statement that makes fish move left and right.
       if(( x >= 9.1)||(x <= 0.9))
       {
        _speed *= -1;
        
        this.rotateY = -rotateY;
        
       }
       
       super.move(x,y,rotateX, rotateY, rotateZ);/////CHECK IT
       
       //System.out.println(_speed);
      
    }
   
}
