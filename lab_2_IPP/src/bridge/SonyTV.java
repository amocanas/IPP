package bridge;

/**
 * Created by Alina on 26/09/2016.
 */
public class SonyTV implements ITV {
    @Override
    public void on(){
        System.out.println("Sony is turned on");
    }

    @Override
    public void off(){
        System.out.printf("Sony is turned off");
    }

    @Override
    public void switchChannel(int channel){
        System.out.println("Sony : channel - " + channel);
    }
}
