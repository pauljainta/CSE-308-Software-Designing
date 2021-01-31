import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MAIN {
   public List<Drive> driveList=new ArrayList<Drive>();
   public List<folder> folderList=new ArrayList<folder>();



    public static void main(String[] args) {
         List<Drive> driveList=new ArrayList<Drive>();
         List<folder> folderList=new ArrayList<folder>();
         List<file> fileList=new ArrayList<file>();

        while(true)
        {
            System.out.println("Enter a choice:");

            System.out.println("1.Create Drive\n"+
                    "2 Remove Drive\n"+
                    "3.Add Folder  " +
                    "4.Add file\n"+
                    "5.Delete folder  "+ "6.Delete File\n"+"7.List(Drive).8.List(Folder).9.List(FIle)\n"+
                    "10.Details(Drive).11.Details(Folder).12.Details(FIle)\n"+"13.Exit");
            Scanner scanner = new Scanner(System.in);
            int x=scanner.nextInt();
            if(x==1)
            {
                Scanner scn = new Scanner(System.in);

                System.out.println("Enter Name: ");
                String name = scn.nextLine();
                driveList.add(new Drive(name));

            }
            else if(x==2)
            {
                Scanner scn = new Scanner(System.in);

                System.out.println("Enter Name of the drive to be deleted: ");
                String name = scn.nextLine();
                int i;
                int n=driveList.size();
                for( i=0;i<driveList.size();i++)
                {
                    Drive d=driveList.get(i);
                    if(d.getName().equalsIgnoreCase(name))
                    {
                        driveList.get(i).remove();
                        driveList.remove(i);
                        break;
                       // d.remove();
                    }
                }
               // System.out.println("i "+i);
                if(i==n)
                {
                    System.out.println("Drive not found");
                }


            }
            else if(x==3)
            {

                folder f;
                Scanner scn = new Scanner(System.in);

                System.out.println("Enter Name: ");
                String name = scn.nextLine();
                System.out.println("Enter Directory: ");
                String directory = scn.nextLine();
                int counter=0;
                for(int i=0;i<directory.length();i++)
                {
                    if(directory.charAt(i)==':') counter++;

                }
                 if(counter==0)
                 {
                       int j;
                       int n=driveList.size();

                     for( j=0;j<driveList.size();j++)
                     {

                         if(driveList.get(j).getName().equals(directory))
                         {
                             f=new folder(name);

                             driveList.get(j).add(f);
                             folderList.add(f);
                             break;


                         }

                     }
                     if(j==n)
                     {
                         System.out.println("No such directory  found");
                     }

                 }
                 else
                 {
                     //String str=String.valueOf(directory.charAt(directory.length()-1));
                   //  System.out.println(str);
                     int j;
                     int n=folderList.size();

                     for( j=0;j<folderList.size();j++)
                     {



                             if(folderList.get(j).getPath().equals(directory))
                             {
                                 f=new folder(name);
                                 folderList.get(j).add(f);
                                 folderList.add(f);
                                 break;


                             }

                     }
                     if(j==n)
                     {
                         System.out.println("No such directory  found");
                     }

                 }



            }

            else if(x==4)
            {

                file f;
                Scanner scn = new Scanner(System.in);

                System.out.println("Enter Name: ");
                String name = scn.nextLine();
                System.out.println("Enter Directory: ");
                String directory = scn.nextLine();
                int counter=0;
                for(int i=0;i<directory.length();i++)
                {
                    if(directory.charAt(i)==':') counter++;

                }
                if(counter==0)
                {
                    int j;
                    int n=driveList.size();

                    for( j=0;j<driveList.size();j++)
                    {

                        if(driveList.get(j).getName().equals(directory))
                        {
                            f=new file(name);

                            driveList.get(j).add(f);
                            fileList.add(f);
                            break;


                        }

                    }
                    if(j==n)
                    {
                        System.out.println("No such directory  found");
                    }

                }
                else
                {
                    //String str=String.valueOf(directory.charAt(directory.length()-1));
                    //  System.out.println(str);
                    int j;
                    int n=folderList.size();

                    for( j=0;j<folderList.size();j++)
                    {



                        if(folderList.get(j).getPath().equals(directory))
                        {
                            f=new file(name);
                            folderList.get(j).add(f);
                            fileList.add(f);
                            break;


                        }

                    }
                    if(j==n)
                    {
                        System.out.println("No such directory found");
                    }

                }



            }
            else if(x==5)
            {
                Scanner scn = new Scanner(System.in);

                System.out.println("Enter Name of the folder to be deleted: ");
                String name = scn.nextLine();
                int i;
                int n=folderList.size();
                for( i=0;i<folderList.size();i++)
                {
                    folder f=folderList.get(i);
                    if(f.getName().equals(name))
                    {
                        folderList.get(i).remove();
                        folderList.remove(i);
                        break;
                        // d.remove();
                    }
                }
                // System.out.println("i "+i);
                if(i==n)
                {
                    System.out.println("folder not found");
                }


            }
            else if(x==6)
            {


                Scanner scn = new Scanner(System.in);

                System.out.println("Enter Name of the file to be deleted: ");
                String name = scn.nextLine();
                int i;
                int n=fileList.size();
                for( i=0;i<fileList.size();i++)
                {
                    file f=fileList.get(i);
                    if(f.getName().equals(name))
                    {
                        fileList.get(i).remove();
                        fileList.remove(i);
                        break;
                        // d.remove();
                    }
                }
                // System.out.println("i "+i);
                if(i==n)
                {
                    System.out.println("File not found");
                }



            }
            else if(x==7)
            {
                Scanner scn = new Scanner(System.in);

                System.out.println("Enter Name: ");
                String name = scn.nextLine();
                int i;
                int n=driveList.size();
                for( i=0;i<driveList.size();i++)
                {
                    Drive d=driveList.get(i);
                    if(d.getName().equals(name))
                    {
                       driveList.get(i).list();
                        //driveList.remove(i);
                        break;
                        // d.remove();
                    }
                }
                // System.out.println("i "+i);
                if(i==n) {

                    System.out.println("Drive not found");
                }

            }

            else if(x==8)
            {
                Scanner scn = new Scanner(System.in);

                System.out.println("Enter Name: ");
                String name = scn.nextLine();
                int i;
                int n=folderList.size();
                for( i=0;i<folderList.size();i++)
                {
                    folder f=folderList.get(i);
                    if(f.getName().equals(name))
                    {
                        folderList.get(i).list();
                        //driveList.remove(i);
                        break;
                        // d.remove();
                    }
                }
                // System.out.println("i "+i);
                if(i==n) {

                    System.out.println("Folder not found");
                }

            }

            else if(x==9)
            {
                Scanner scn = new Scanner(System.in);

                System.out.println("Enter Name: ");
                String name = scn.nextLine();
                int i;
                int n=fileList.size();
                for( i=0;i<fileList.size();i++)
                {
                    file f=fileList.get(i);
                    if(f.getName().equals(name))
                    {
                        fileList.get(i).list();
                        //driveList.remove(i);
                        break;
                        // d.remove();
                    }
                }
                // System.out.println("i "+i);
                if(i==n) {

                    System.out.println("file not found");
                }

            }

            else if(x==10)
            {
                Scanner scn = new Scanner(System.in);

                System.out.println("Enter Name: ");
                String name = scn.nextLine();
                int i;
                int n=driveList.size();
                for( i=0;i<driveList.size();i++)
                {
                    Drive d=driveList.get(i);
                    if(d.getName().equals(name))
                    {
                        driveList.get(i).details();
                        //driveList.remove(i);
                        break;
                        // d.remove();
                    }
                }
                // System.out.println("i "+i);
                if(i==n) {

                    System.out.println("Drive not found");
                }

            }

            else if(x==11)
            {
                Scanner scn = new Scanner(System.in);

                System.out.println("Enter Name: ");
                String name = scn.nextLine();
                int i;
                int n=folderList.size();
                for( i=0;i<folderList.size();i++)
                {
                    folder f=folderList.get(i);
                    if(f.getName().equals(name))
                    {
                        folderList.get(i).details();
                        //driveList.remove(i);
                        break;
                        // d.remove();
                    }
                }
                // System.out.println("i "+i);
                if(i==n) {

                    System.out.println("Folder not found");
                }

            }

            else if(x==12)
            {
                Scanner scn = new Scanner(System.in);

                System.out.println("Enter Name: ");
                String name = scn.nextLine();
                int i;
                int n=fileList.size();
                for( i=0;i<fileList.size();i++)
                {
                    file f=fileList.get(i);
                    if(f.getName().equals(name))
                    {
                        fileList.get(i).details();
                        //driveList.remove(i);
                        break;
                        // d.remove();
                    }
                }
                // System.out.println("i "+i);
                if(i==n) {

                    System.out.println("file not found");
                }

            }
            else if(x==13)
            {
               // System.out.println("Exit");
                break;
            }
            else System.out.println("Invalid choice");






        }

    }


}
