package Behaviours;
import env3d.Env; 
import java.util.*;
import Mouse.*;
/**
 * Write a description of class FoodManager here.
 * 
 * @author (me) 
 * @version (0)
 */
public class FoodManager implements ImouseListener
{
    // instance variables - replace the example below with your own
    //private static String  model = "sphere";
    
   // private static  String texture = "textures/javaFish/Bubble.png";
    
    // DECLARE arraylist for behaviours, call it '_behaviour':
    private ArrayList<IBehaviour> _behaviour;
    
    

    /**
     * Constructor for objects of class FoodManager
     */
    public FoodManager()
    {
        // initialise instance variables
        //behaviour arraylist
        _behaviour = new ArrayList<IBehaviour>();
        
    }

    /**
     * update method
     * 
     * @param  env world
     * @return   
     */
    public void Update(Env env)
    {
        ///trying to use observer pattern
        //_behaviour = BubbleBehaviour.Update();
        //double posnX = rtnVal[0]*0.0125;//return x value
       // double posnY = rtnVal[1]*0.0125;///return y value
        //world.addObject(token);
       
    }
    
    /**
     * An onmouse method
     * 
     * @param int rtnVal
     * @return int rtnVal 
     */
    public int[] OnMouse(int[] rtnVal)
    {
        
       return rtnVal; 
    }
    
    
    
}
