package AbstractFactory;

/**
 * Created by Alina on 10/22/2016.
 */
public class MacOSWindow implements Window{
    public void setTitle(String text){
        System.out.println("This is MAC OS");
    }
    public void repaint(){
        //Mac OSX specific behaviour
    }
}
