public interface AdvancvedMediaPlayer {


    void playVLC(String filename);
    void playMP4(String filename);

}
class VLCPlayer implements AdvancvedMediaPlayer
{

    @Override
    public void playVLC(String filename) {
        System.out.print("playing vlc file Name: "+filename);
    }

    @Override
    public void playMP4(String filename) {
        //do nothing
    }
}
class MP4Player implements AdvancvedMediaPlayer
{

    @Override
    public void playVLC(String filename) {
    }

    @Override
    public void playMP4(String filename) {
        System.out.print("playing mp4 file Name: "+filename);
    }
}