package AbstractFactory;

/**
 * Created by Alina on 10/22/2016.
 */
public class MacOSXWidgetFactory implements AbstractWidgetFactory{
    //create a MacOSXWindow
    public Window createWindow(){
        MacOSWindow window = new MacOSWindow();
        return window;
    }
}
