package Mouse;
import env3d.Env;

/**
 * mouselistener interface
 * 
 * @author (me) 
 * @version (2)
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
