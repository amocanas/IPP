package bridge;

/**
 * Created by Alina on 26/09/2016.
 */
public class main {

    public static void main(String[] args){
        ITV tv = new SonyTV();
        LogitechRemoteControl lrc = new LogitechRemoteControl(tv);
        lrc.setChannelKeyboard(100);
    }
}
