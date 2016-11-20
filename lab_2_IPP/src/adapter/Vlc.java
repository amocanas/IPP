package adapter;

/**
 * Created by Alina on 26/09/2016.
 */
public class Vlc implements MediaPackage {
    @Override
    public void playFile(){
        System.out.println("Playing VLC File");
    }
}
