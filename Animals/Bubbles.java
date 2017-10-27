package Animals;


/**
 * class for seperate bubble entity since it is not a true animal
 * 
 * @author Justin 
 * @version (0)
 */
public class Bubbles extends Token
{
     // Fields:
    private double _speed;
    
    // reference to the 3D model:
    private String model = "sphere";
    
    private String texture = "textures/javaFish/Bubble.png";/////it is private now
    
    /**
     * Constructor for objects of class bubbles
     * @param string objecttexture string model
     * @return none
     */
    public Bubbles(String ObjectTexture,String model)
    {
        // initialise instance variables
        super(ObjectTexture,model);
        this.scale = 0.1;
    }
    
    /**
     * overriding bubble constructor because positions were needed
     * @param strin objecttexture string model double xpos double ypos
     * @return none
     */
    public Bubbles(String ObjectTexture,String model,double xpos,double ypos)
    {
        // initialise instance variables
        super(ObjectTexture,model);
        this.scale = 0.1;//rescalling bubble model
        this.x = xpos;
        this.y = ypos;
    }
    
    
}
