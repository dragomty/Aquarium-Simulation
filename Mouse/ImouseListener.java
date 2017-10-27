package Mouse;
import env3d.Env;

/**
 * mouselistener interface
 * 
 * @author Justin 
 * @version (0)
 */
public interface ImouseListener
{
    /**
     * An mouselistener interface
     * 
     * @param 
     * @return        
     */
    void Update(Env env);
    int [] OnMouse(int[] mouseVal);
}
