package Behaviours;

import env3d.Env;
import java.util.*;
import Mouse.*;

/**
 * Mousehandler class for simulation and publisher for events
 * 
 * @author Marc Price && me
 * @version 0.5
 */
public class MouseHandler implements ImousePublisher////for some reason
{
    // static instance variables (constants):
   
    // instance variables:
    //list of mouse listeners
    private List<ImouseListener> _listeners; 

    /**
     * Constructor for objects of class MouseHandler
     */
    public MouseHandler()
    {
        // initialise instance variables:
        _listeners = new ArrayList<ImouseListener>();
    }
    
    /**
     * METHOD: subscribe
     *
     * @return     
     */
    public void Subscribe(ImouseListener IMouseListener)
    {
        _listeners.add(IMouseListener);
    }
    
     /**
     * METHOD: unsubscribe
     *
     * @return     
     */
    public void Unsubscribe(ImouseListener IMouseListener)
    {
        _listeners.remove(IMouseListener);
    }
    
    /**
     * METHOD: update
     *
     * @return     
     */
    public void Update(Env env)
    {
        
    }
    
    /**
     * METHOD: ommouse
     *
     * @return     
     */
    public int[] OnMouse(int[] mouseVal)
    {
        
        return mouseVal;
    }
    
    
    /**
     * METHOD: Return the Mouse state
     *
     * @return     the x,y coordinates of the mouse pointer or -1,-1 if not clicked.
     */
    public int[] check(Env env)
    {
        // local variables:
        // DECLARE an int[] array for the method return value
        // INITIALISE: to return -1,-1
        int[] rtnVal={-1,-1};
        
        // IF: the left mouse button has been clicked
        if (env.getMouseButtonClicked() == 0)
        {
            rtnVal[0] = env.getMouseX();
            rtnVal[1] = env.getMouseY();
            
            for(ImouseListener IMouseListener : _listeners)
            {
                IMouseListener.OnMouse(rtnVal);
            }      
        }

        return rtnVal;
    }

}
