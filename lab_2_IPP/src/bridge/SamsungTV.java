package bridge;

/**
 * Created by Alina on 26/09/2016.
 */
public class SamsungTV implements ITV{
    @Override
    public void on(){
        System.out.printf("Samsung is turned on");
    }

    @Override
    public void off(){
        System.out.printf("Samsung is turned off");
    }

    @Override
    public void switchChannel(int channel){
        System.out.println("Samsung : channel- " + channel);
    }
}
