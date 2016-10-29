package AbstractFactory;

/**
 * Created by Alina on 10/22/2016.
 */
public class GUIBuilder {
    public void buildWindow(AbstractWidgetFactory widgetFactory){
        Window window = widgetFactory.createWindow();
        window.setTitle("New Window");
    }
}
