package AbstractFactory;

/**
 * Created by Alina on 10/22/2016.
 */
public class MSWindow implements Window{
    public void setTitle(String text){
        System.out.println("This is Windows OS.");
    }
    public void repaint(){
        //MS Windows specific behaviour
    }
}
