package Animals;

/**
 * Token class that holds its fields.
 * 
 * @author me
 * @version 0
 */
public class Token implements IToken///i dont want to make this abstract????/
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
   
   
    // --------------------------------------------- //
    
   
    /**
     * Constructor for objects of class Token
     * constructor has to  take 3 parameters(string to initialise
     * texture field and two doubles to initialise x and y coordinates)
     * 
     */
    public Token(String ObjectTexture,String model)
    {
     ////setPosition(xpos,ypos);//changed 27 1--------------*+*-------------+-----++++-++-+-*+--------------------------------------------------------------------------------------------------------------------++++------------------------++------------------------------------------*---
     texture = ObjectTexture;///this is IMPORTANT!!!!!!!!
 
    }
    
    public Token(String ObjectTexture, double xpos, double ypos, String SphereModel)
    {
        texture = ObjectTexture;///this is IMPORTANT!!!!!!!!
        model = SphereModel;
        this.x = xpos;//you need these 2 from setposition method to make it nice and clean
        this.y = ypos;//you need these 2 from setposition method to make it nice and cl
    }

    /**
     * METHOD: Place the token at the given orientation within the aquarium
     *
     * @param  coords   the new orientation (x,y,z) of the token as an array of three Doubles
     */
    public void orientation(Double ...coordinates)//taken from week 11
    {
        // VALIDATE coords:

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
       
        //this.x += _speed;
    }
    
   
    

}
