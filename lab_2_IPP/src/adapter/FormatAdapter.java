package adapter;

/**
 * Created by Alina on 26/09/2016.
 */
public class FormatAdapter implements MediaPlayer {
    private MediaPackage media;

    public FormatAdapter(MediaPackage _media){
        media = _media;
    }

    @Override
    public void play(){
        System.out.println("Using Adapter - ");
        media.playFile();
    }
}
