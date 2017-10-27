package Behaviours;
import Animals.IToken;
import java.util.Random;//import random to randomizes taken from website http://www.javapractices.com/topic/TopicAction.do?Id=62
import java.lang.String;

/**
 * A class for the javafish behaviour. Responsible for movement and positioning.
 * 
 * @author Justin
 * @version 0
 * 
 */
public class BubbleBehaviour extends Behaviour
{
    // instance variables - replace the example below with your own
 
   // position in to be placed at in 3D world (x,y,z coordinates):
   private double x=1.0, y=1.0, z=1.0;
   
     // orientation to be placed at in 3D world (about x,y,z):
   private double rotateX=0, rotateY=-90, rotateZ=0;
   
   
   
    /**
     * Constructor for objects of class bubblebehaviour
     * @param BehaviourToken,xRot,yRot,zRot
     * 
     */
    public BubbleBehaviour(IToken BehaviourToken, double xRot, double yRot, double zRot)
    {
        super(BehaviourToken);///calling parent class
        // initialise instance variables
        //this.x = _randomPos;///////////
        //this.y = _randomPos;////////////////////
        this.rotateX = xRot;
        this.rotateY = yRot;
        this.rotateZ = zRot;
        
        _speed = 0.005;
             
    }
    
    /**
     * Constructor for objects of class bubblebehaviour
     * @param BehaviourToken,xRot,yRot,zRot
     * 
     */
    public BubbleBehaviour(IToken BehaviourToken, double xpos, double ypos, double xRot, double yRot, double zRot)
    {
        super(BehaviourToken);///calling parent class
        // initialise instance variables
        //this.x = _randomPos;///////////
        //this.y = _randomPos;////////////////////
        this.rotateX = xRot;
        this.rotateY = yRot;
        this.rotateZ = zRot;
        this.x = xpos;
        this.y = ypos;
        
        _speed = 0.005;
             
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
     * testing method
     *
     */
    public double speed()
    {
        double speedVal = _speed;
        return _speed;
    }
    
    /**
     * making the random position accesible to bubbles
     * 
     */
    /*public double BrndPosition()
    {
        double BrndPos = _randomPos;
        return _randomPos;
        
    }*/
    
  
    /**
     * A movement method for bubble
     * 
     * @param none
     * @return none
     */
    
    public void move()
    {
       y += _speed;//applies our speed to x axis
       
       super.move(x,y,rotateX, rotateY, rotateZ);/////CHECK IT
       System.out.println(_speed);
      
    }
   
}
