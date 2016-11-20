package bridge;

/**
 * Created by Alina on 26/09/2016.
 */
public class LogitechRemoteControl extends AbstractRemoteControl{

    public LogitechRemoteControl(ITV tv){
        super(tv);
    }

    public void setChannelKeyboard(int channel){
        setChannel(channel);
        System.out.printf("Logitech use keyword to set channel");
    }
}
