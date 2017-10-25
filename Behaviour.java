package Behaviours;
import Animals.IToken; 
import java.util.Random;//import random to randomizes taken from website http://www.javapractices.com/topic/TopicAction.do?Id=62

/**
 * Write a description of class Behaviour here.
 * 
 * @author Justin
 * @version 0
 */
public abstract class Behaviour implements IBehaviour 
{
   // instance variables - replace the example below with your own
   private IToken _token;
  
   // DECLARE a double to hold the swim speed, call it '_speed':
   protected double _speed;///you need speed here because behaviour needs speed and token is only responsible for appearance
   
   protected double _randomPos;//variable for randomposition
   
    /**
     * Constructor for objects of class Behaviour
     * @param IToken BehaviourToken
     * 
     */
    public Behaviour(IToken BehaviourToken)
    {
        _token = BehaviourToken;//instantiate behaviour token
        initialiseNewSpeed(); // instantiating random speed method
        initialisePosition(); // instantiating random position method
    }
    
    /**
     * METHOD: accessor speed method
     *
     * return speed value
     */
    public double getSpeed()//accessor method for speed
    {
       return _speed;
    }
    
    /**
     * METHOD: accessor position method
     * return random position
     * 
     */
    public double getPos()//accessor method for random position
    {
        return _randomPos;
    }
    
    
    /*public void soundPlay(java.lang.String bubbleSound, double _bubblesound)
    {
        if(sound == true && _bubblesound == 4)
        {
         //bubble = new File("bubble.waw");
       // .play("bubble.waw");
        
       } 
       sound = false;
    }*/
    
    /**
     * METHOD: random number generator method which calls random method and
     * has min and max values. It generates a number and returns it as our new _speed value.
     * 
     */

     public double initialiseNewSpeed()/////double because returns double
    {
       /*
        Random rnd = new Random();  
        double min = 0.005;////min and max valuees for our random method
        double max = 0.04;
       
      //  0 + 0.005 = min value
       // 1 * 0.04  0.006  = max value 
       
        //SET new randomised speed to _speed
       _speed = (double)(rnd.nextDouble() * max + min);
          */
         double random;
       double min = 0.005;
       double max = 0.05;
       random = min + (double)(Math.random()*max); 
        _speed = random;
      
       //RETURN randomised speed
       return _speed;
    }
    
    /**
     * METHOD: random position generator method which calls random method and
     * has min and max values. It generates a number and returns it as our new _randomPos value.
     * 
     */
    public double initialisePosition()/////double because returns double
    {
      
       double random;
       double min = 1;
       double max = 6;
       random = min + (double)(Math.random()*max); 
       _randomPos = random;
      
       //RETURN randomised speed
       return _randomPos;
    }
    
   /* public int bubbleSound()//
    {
        int random;
       int min = 1;
       int max = 8;
       random = min + (int)(Math.random()*max); 
     //  _bubbleSound = random;
      
       //RETURN randomised speed
       return _bubbleSound;
        
    }*/

    /**
     * 
     * delete all the code responsible for moving and leave only the line which loads into token move
     * as this is an abstract class
     * @param xpos,ypos,yRot,yRot,zRot
     */
    public void move(double xpos, double ypos, double xRot, double yRot, double zRot)
    {
       
      _token.move(xpos,ypos,xRot,yRot,zRot);////THIS!!!!!!!!!!!!
     // _token.move(5.0, 5.0, 0.0, -90.0, 0.0);////THIS!!!!!!!!!!!!
    }
}
