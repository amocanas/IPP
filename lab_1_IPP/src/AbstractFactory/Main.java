package AbstractFactory;

import com.sun.media.jfxmediaimpl.platform.Platform;

/**
 * Created by Alina on 10/22/2016.
 */
public class Main {
    public static void main(String[] args){
        GUIBuilder builder = new GUIBuilder();
        String OS = System.getProperty("os.name").toLowerCase();
        AbstractWidgetFactory widgetFactory = null;
        //check what platform we're on
        if(OS.indexOf("mac") >= 0){
            widgetFactory  = new MacOSXWidgetFactory();
        } else {
            widgetFactory  = new MsWindowsWidgetFactory();
        }
        builder.buildWindow(widgetFactory);
    }
}
