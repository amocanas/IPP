package adapter;

/**
 * Created by Alina on 26/09/2016.
 */
public class main {

    public static void main(String[] args) {
        //playing mp3 file
        MediaPlayer player = new Mp3();
        player.play();

        /*since mp4 and vlc are incompatible,I need to add new media package, and FormatAdapter
        will adapt the new media package so that incopatible formats can work as well.
         */
        player = new FormatAdapter(new Mp4());
        player.play();
    }
}
