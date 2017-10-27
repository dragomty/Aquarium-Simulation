package Animals;
/**
 * This is interface for IToken.
 * 
 * @author me 
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
     void move(double xpos, double ypos, double rotateX, double rotateY, double rotateZ);///let this be protected
    
    //public void position(Double ...coordinates) throws ArgumentOutOfBoundsException;//week 11
    
    public void orientation(Double ...coordinates);//week 11
  
      
          
}
