package Behaviours;
import env3d.Env; 
import java.util.*;
import Mouse.*;
/**
 * 
 * 
 * @author Justin 
 * @version (0)
 */
public class FoodManager implements ImouseListener
{
 
    // DECLARE arraylist for behaviours, call it '_behaviour':
    private ArrayList<IBehaviour> _behaviour;
    
    

    /**
     * Constructor for objects of class FoodManager
     */
    public FoodManager()
    {
        // initialise instance variables
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
