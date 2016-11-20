package bridge;

/**
 * Created by Alina on 26/09/2016.
 */
public class AbstractRemoteControl {
    private ITV tv;

    public AbstractRemoteControl(ITV tv){
        this.tv = tv;
    }

    public void setChannel(int channel){
        tv.switchChannel(channel);
    }
}
