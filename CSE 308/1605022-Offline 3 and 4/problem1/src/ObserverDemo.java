import java.util.Scanner;

public class ObserverDemo {


    public static void main(String[] args) {

        Premium_user premium_user=new Premium_user();
        Regular_user regular_user=new Regular_user();
        Server server=new Server();
        server.setPremium_user(premium_user);
        server.setRegular_user(regular_user);
        while(true) {

            System.out.println("Enter Input:");

            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();

            String str;

            if(x==0)  str="operational";
            else if(x==1) str="partially down";
            else if(x==2) str="fully down";
            else break;
            server.setCurrentState(str);



        }


    }
}
