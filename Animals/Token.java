package Animals;

/**
 * Token class that holds its fields.
 * 
 * @author Justin
 * @version 0
 */
public class Token implements IToken
{
    // Instance variables (fields):
    // --- DECLARE instance variables rqd by Env3D:
    // reference to the 3D model:
    private String model = "models/billboard/billboard.obj";
    
    // scale factor to be applied to model:
    protected double scale= 4.6/10; //0.6 was and this makes fish the size less than one tenth of the screen
    //protected static final
    // transparency flag - set to true:
    private boolean transparent=true;
    
    private String texture = "";
    
    // position in to be placed at in 3D world (x,y,z coordinates):
    public double x=1.0, y=1.0, z=1.0;
    
    // orientation to be placed at in 3D world (about x,y,z):
   protected double rotateX=0, rotateY=-90, rotateZ=0;
   
   
    // -------------------------------------------- //
    
   
    /**
     * Constructor for objects of class Token
     * 
     */
    public Token(String ObjectTexture,String model)
    {
    
     texture = ObjectTexture;
 
    }
    
    public Token(String ObjectTexture, double xpos, double ypos, String SphereModel)
    {
        texture = ObjectTexture;
        model = SphereModel;
        this.x = xpos;
        this.y = ypos;
    }

    /**
     * METHOD: Place the token at the given orientation within the aquarium
     *
     */
    public void orientation(Double ...coordinates)
    {
        
        // SET the new orientation:
        rotateX = coordinates[0];
        rotateY = coordinates[1];
        rotateZ = coordinates[2];

    }
    
    /**
     * METHOD: Updates all fields according to desired algorithm.
     * Called on each pass of the simulation
     * @param xpos,ypos,yRot,xRot,zRot.
     *
     */
    public void move(double xpos, double ypos, double xRot, double yRot, double zRot)
    {
      
        this.x = xpos;
        this.y = ypos;
        this.rotateX = xRot;
        this.rotateY = yRot;
        this.rotateZ = zRot;
       
    }
    
}
