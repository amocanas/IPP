package AbstractFactory;

/**
 * Created by Alina on 10/22/2016.
 */
public class MsWindowsWidgetFactory implements AbstractWidgetFactory{
    //create an MSWindow
    public Window createWindow(){
        MSWindow window = new MSWindow();
        return window;
    }
}
