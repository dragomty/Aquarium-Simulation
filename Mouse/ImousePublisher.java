package Mouse;
import env3d.Env; 

/**
 * Write a description of interface ImousePublisher here.
 * 
 * @author (me) 
 * @version (0)
 */
public interface ImousePublisher
{
    /**
     * An example of a method header - replace this comment with your own
     * 
     * @param  y    a sample parameter for a method
     * @return        the result produced by sampleMethod 
     */
    int[] OnMouse(int[] rtnVal);
    void Subscribe(ImouseListener IMouseListener);
    void Unsubscribe(ImouseListener IMouseListener);
    void Update(Env env);
}
