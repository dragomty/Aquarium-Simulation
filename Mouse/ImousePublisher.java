package Mouse;
import env3d.Env; 

/**
 * 
 * 
 * @author Justin
 * @version (0)
 */
public interface ImousePublisher
{

    int[] OnMouse(int[] rtnVal);
    void Subscribe(ImouseListener IMouseListener);
    void Unsubscribe(ImouseListener IMouseListener);
    void Update(Env env);
}
