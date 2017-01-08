/**
 * Created by hjing on 1/7/17.
 */
public class Decorate extends People{

    protected People component;

    public void dressing(People component)
    {
        this.component = component;
    }

    public void show() {
        if(component !=null)
        {
            component.show();
        }
    }
}
