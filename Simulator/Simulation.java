package Simulator;
import Behaviours.*;
import Animals.*;
import Mouse.*;
import env3d.Env;   
import java.util.*;
import jff5.*;

/**
 * Simulation is the top-level class for the Aquarium simulation.
 * 
 * @author Justin
 * @version 0
 */
public class Simulation
{
     // instance variables:
    // DECLARE a reference to the instance of the Core class, call it '_core'
    private Core _core;
    
    // DECLARE a reference to the instance of the 'Env' (environment) class, call it '_world'
    private Env _world;
   
    // DECLARE arraylist for behaviours, call it '_behaviour'
    private ArrayList<IBehaviour> _behaviour;
    
    //Declare static simulation instance
    private static Simulation sim;
    
    // DECLARE arraylist for tokens, call it '_token'
    private ArrayList<IToken> _token;
    
    private ArrayList<FoodBehaviour> _behaviourF;
    
    // DECLARE a reference to the instance of the 'MouseHandler' class, call it '_mouse'
    private MouseHandler _mouse;
   
    // DECLARE a boolean that signals when the simulation loop should be exited
    private boolean endSim = false;
    
    

    public static void main(String[] args)
    {
        Sim();
        sim.populate();
        sim.run();
    }
    
    
    /**
     * Constructor for objects of class Simulation
     */
    private Simulation()
    {
        // INITIALISE instance variables
        _core = new Core();
        _token = new ArrayList<IToken>();//arraylist list for tokens
        _behaviour = new ArrayList<IBehaviour>();///arraylist for different behaviours
        _mouse = new MouseHandler();
        _behaviourF = new ArrayList<FoodBehaviour>();
    }

    /**
     *METHOD: static Sim
     *@param none
     *@return none
     */
    private static Simulation Sim()
    {
        if(sim == null)//if theres no simulation 
        {
            sim = new Simulation();//create sim of type simulation
            
        }
        return sim;//returning simulation
        
    }
    /**
     * METHOD: Populate the scene with different animals
     *
     */
    private void populate()
    {
        float offset = 1.5f;
        IToken token;
        IBehaviour behaviour;
        
        token = new Token("textures/javaFish/JavaFish.png", "models/billboard/billboard.obj");///adding fishes below
        addToken(token);///EVERYTHING becomes token
        addBehaviour(new JavaFishBehaviour(token, 0, -90, 0));//apply behaviour
        
        token = new Token("textures/javaFish/OrangeFish.png", "models/billboard/billboard.obj");
        addToken(token);///EVERYTHING becomes token
        addBehaviour(new JavaFishBehaviour(token, 0, -90, 0));
        
        token = new Token("textures/javaFish/JavaFish.png", "models/billboard/billboard.obj");
        addToken(token);///EVERYTHING becomes token
        addBehaviour(new JavaFishBehaviour(token, 0, -90, 0));
        
        token = new Token("textures/javaFish/JavaFish.png", "models/billboard/billboard.obj");
        addToken(token);///EVERYTHING becomes token
        addBehaviour(new JavaFishBehaviour(token, 0, -90, 0));
        
        token = new Token("textures/javaFish/JavaFish.png", "models/billboard/billboard.obj");
        addToken(token);///EVERYTHING becomes token
        addBehaviour(new JavaFishBehaviour(token, 0, -90, 0));
        
        token = new Token("textures/javaFish/JavaFish.png", "models/billboard/billboard.obj");
        addToken(token);///EVERYTHING becomes token
        addBehaviour(new JavaFishBehaviour(token, 0, -90, 0));
        
        token = new Token("textures/javaFish/JavaFish.png", "models/billboard/billboard.obj");
        addToken(token);///EVERYTHING becomes token
        addBehaviour(new JavaFishBehaviour(token, 0, -90, 0));
        
        token = new Token("textures/javaFish/JavaFish.png", "models/billboard/billboard.obj");
        addToken(token);///EVERYTHING becomes token
        addBehaviour(new JavaFishBehaviour(token, 0, -90, 0));
        
        token = new Token("textures/javaFish/JavaFish.png", "models/billboard/billboard.obj");
        addToken(token);///EVERYTHING becomes token
        addBehaviour(new JavaFishBehaviour(token, 0, -90, 0));
        
        token = new Token("textures/javaFish/JavaFish.png", "models/billboard/billboard.obj");
        addToken(token);///EVERYTHING becomes token
        addBehaviour(new JavaFishBehaviour(token, 0, -90, 0));
        
        token = new Token("textures/javaFish/Urchin.png", "models/billboard/billboard.obj");
        addToken(token);///EVERYTHING becomes token
        addBehaviour(new UrchinBehaviour(token, 1, -180, 90, 0));
        
        token = new Token("textures/javaFish/Piranha1.png", "models/billboard/billboard.obj");
        addToken(token);///EVERYTHING becomes token
        addBehaviour(new PiranhaBehaviour(token, -180, 90, 0));
        
        token = new Token("textures/javaFish/SeaHorse.png", "models/billboard/billboard.obj");
        addToken(token);///EVERYTHING becomes token
        addBehaviour(new SeahorseBehaviour(token, -180, 90, 0));
        
        
        token = new Bubbles("textures/javaFish/Bubble.png","sphere");
        addToken(token);
        addBehaviour(new BubbleBehaviour(token,0,-90,0));
    }
    
    /**
     * Add token method
     *
     * @param   token
     */
    public void addToken(IToken token)
    {
        
        if (token != null)
        {
            
        _token.add(token);
        
        }
    }
    
    /**
     * Add behaviour method
     *
     * @param   behaviour
     */
    public void addBehaviour(IBehaviour behaviour)
    {
        if (behaviour != null)
        { 
            _behaviour.add(behaviour);
        }
        
        
    }
    
     /**
     * Add behaviour method
     *
     * @param   behaviour
     */
    public void rBehaviour(IBehaviour behaviour)
    {
        if (behaviour != null)
        { 
            _behaviour.remove(behaviour);
        }
        
    }
    
    public void remFood(IToken token)
    {
        if(token != null)
        {
            _token.remove(token);
        }
        
    }

    /**
     * METHOD: Run the simulation loop
     *
     */
    public void run()
    {
        // CREATE the environment:
        _world = _core.createWorld();
        
        // ADD token to 3D world:
        for (IToken token : _token)
            _world.addObject(token);
            
           
        // Start simulation loop:
        while (!endSim)
        {
            // UPDATE STAGE:
            if (_world.getKey() == 1)
            {
                //render loop exit condition
                endSim = true;
            }
            
            int[] rtnVal = _mouse.check(_world);//checks mouse position in world
            
            double posnX = rtnVal[0]*0.0125;//return x value
            double posnY = rtnVal[1]*0.0125;///return y value
            
            if(rtnVal[1]>= 1)//if mouse clicked
            {
                    Food food = new Food("textures/javaFish/FishFood.png","sphere",posnX,posnY);//giving food mouse position
                    _world.addObject(food);//create food
                    FoodBehaviour fud = new FoodBehaviour(food,posnX,posnY,0,-90,0);//add food behaviour
                    addBehaviour(fud);
                    
                    if(food.y > -7)
                    {
 
                        remFood(food);
                        
                    }
                    
            }
            
            // UPDATE Objects in 3D world:
            for (IBehaviour behaviour : _behaviour)
                behaviour.move();//applying behaviour
                
                
            // RENDER STAGE
            // UPDATE: the environment
            _core.updateWorld();
        }
        
        // EXIT: cleanly by closing-down the environment:
        _core.destroyWorld();

    }

}
