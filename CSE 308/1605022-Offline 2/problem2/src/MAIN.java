import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MAIN {


    public static void main(String[] args) {
        List<media> mediaList=null;
        AudioPlayer player=new AudioPlayer();
        while(true)
        {
            Scanner scanner=new Scanner(System.in);

            System.out.println("1.Create Playlist\n 2.Add to current playlist\n 3.Display Current Playlist\n 4.Create another");
            int x=scanner.nextInt();
            if(x==1)
            {
                if(mediaList==null) {
                    mediaList = new LinkedList<media>();
                    System.out.println("Playlist Created");
                }
                else
                {
                    System.out.println("Enter 4 to create another playlist");
                }


            }
            else if(x==2)
            {
                if(mediaList!=null) {
                    Scanner scn = new Scanner(System.in);
                    System.out.println("Enter name:");
                    String name = scn.nextLine();
                    System.out.println("Enter type:");
                    String type = scn.nextLine();
                    System.out.println("Enter duration:");
                    double duration = scn.nextFloat();
                    if(type.equalsIgnoreCase("mp3")||type.equalsIgnoreCase("mp4")||type.equalsIgnoreCase("vlc"))
                        mediaList.add(new media(name, type, duration));
                }
                else System.out.println("No playlist available");

            }
            else if(x==3)
            {
                if(mediaList!=null) {
                    System.out.println("Currently Playing playlist");
                    for (int i = 0; i < mediaList.size(); i++) {
                        media M = mediaList.get(i);
                        player.play(M.type, M.name);
                        System.out.println("  Duration "+M.getDuration());

                    }
                }
                else System.out.println("No playlist available");



            }
            else if(x==4)
            {
                if(mediaList!=null) {
                    System.out.println("Enter elapsed time in minutes:");
                    Scanner scn = new Scanner(System.in);
                    double elapsed_time = scn.nextFloat();
                    double total_duration = 0;
                    for (int i = 0; i < mediaList.size(); i++) {
                        total_duration += mediaList.get(i).getDuration();

                    }
                    if (elapsed_time >= total_duration) {
                        mediaList = new LinkedList<media>();
                        System.out.println("New Playlist Created");

                    } else {
                        System.out.println("Can't create new playlist");

                    }
                }


            }



        }




    }
}
