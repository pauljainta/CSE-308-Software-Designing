public interface MediaPlayer {

    void play(String audiotype,String filename);



}
class MediaAdapter implements MediaPlayer
{

    AdvancvedMediaPlayer advancvedMediaPlayer;
    public MediaAdapter(String audiotype)
    {

        if(audiotype.equalsIgnoreCase("vlc"))
        {
            advancvedMediaPlayer=new VLCPlayer();
        }
        else  if(audiotype.equalsIgnoreCase("mp4"))
        {
            advancvedMediaPlayer=new MP4Player();
        }

    }

    @Override
    public  void play(String audiotype,String filename)
    {
        if(audiotype.equalsIgnoreCase("vlc"))
        {
            advancvedMediaPlayer.playVLC(filename);
        }
        else  if(audiotype.equalsIgnoreCase("mp4"))
        {
            advancvedMediaPlayer.playMP4(filename);
        }




    }


}
class AudioPlayer implements MediaPlayer
{

    MediaAdapter mediaAdapter;
    @Override
    public  void play(String audiotype,String filename)
    {

        if(audiotype.equalsIgnoreCase("mp3"))
        {
            System.out.print("Playing mp3 file. Name: "+filename);

        }
        else  if(audiotype.equalsIgnoreCase("mp4")||audiotype.equalsIgnoreCase("vlc"))
        {
                mediaAdapter=new MediaAdapter(audiotype);
                mediaAdapter.play(audiotype,filename);
        }
        else
        {
            System.out.println("Format not supported");
        }



    }


}