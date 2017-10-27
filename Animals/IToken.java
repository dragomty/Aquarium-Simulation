package Animals;
/**
 * This is interface for IToken.
 * 
 * @author Justin 
 * @version 0
 */
public interface IToken 
{
    /**
     * Move method 
     * 
     * @param        xpos,ypos,rotatex,rotatey,rotatez
     * @return       nothing
     */
     void move(double xpos, double ypos, double rotateX, double rotateY, double rotateZ);
    
   
    
    public void orientation(Double ...coordinates);
  
      
          
}
