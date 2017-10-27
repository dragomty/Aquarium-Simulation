package Animals;


/**
 * Write a description of class Food here.
 * 
 * @author (me) 
 * @version (0.1)
 */
public class Food extends Token
{
    // instance variables - replace the example below with your own
    // reference to the 3D model:
    private String model = "sphere";
    
    private String texture = "textures/javaFish/FishFood.png";/////it is private now

    /**
     * Constructor for objects of class Food
     * @param string model
     * @return none
     */
    public Food(String ObjectTexture,String model)
    {
         // initialise instance variables
        super(ObjectTexture,model);
        this.scale = 0.1;//rescalling food model

    }
    
     /**
     * Constructor for objects of class Food
     * @param string string xpos ypos
     * @return none
     */
    public Food(String ObjectTexture,String model,double xpos,double ypos)
    {
         // initialise instance variables
        super(ObjectTexture,model);
        this.x = xpos;
        this.y = ypos;
        scale = 0.1;//rescalling food model
       
    }
    
}
