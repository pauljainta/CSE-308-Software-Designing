
import java.util.Scanner;

public class Server
{
    Premium_user premium_user;
    Regular_user regular_user;

  private String currentState,prevState;
 public Server()
 {
     currentState="operational";
 }




    public void setPremium_user(Premium_user premium_user) {
        this.premium_user = premium_user;
    }


    public void setRegular_user(Regular_user regular_user) {
        this.regular_user = regular_user;
    }



    public void setCurrentState(String currentState) {

        this.prevState=this.currentState;
        this.currentState=currentState;
        notifyPremiumUser();
        notifyRegularUser();


    }



    public void notifyPremiumUser() {

        if(currentState.equalsIgnoreCase("partially down")&& prevState.equalsIgnoreCase("operational"))
        {
                premium_user.notify("Premium user prompt: Server is partially down now.\n" +
                        " Do you want to use service from two servers (partially from the server of our company and partially from the server of DEF company) or from one server (server of DEF company)?  \n");
                System.out.println (" Please choose:\n" +
                        "1. one server\n" +
                        "2. two servers");

            Scanner scn=new Scanner(System.in);
            int x=scn.nextInt();
            return;




        }

        else if(currentState.equalsIgnoreCase("fully down")&& prevState.equalsIgnoreCase("partially down"))
        {

            premium_user.notify(" Premium user prompt: Server is fully down now. All of your services has been shifted to the server of DEF company. ");

        }


        else if(currentState.equalsIgnoreCase("operational") && prevState.equalsIgnoreCase("fully down") )
        {
            premium_user.notify("\n" +
                    "Premium user prompt: Now the server is operational again.\n");


        }

        else if(currentState.equalsIgnoreCase("fully down") && prevState.equalsIgnoreCase("operational") )
        {
            premium_user.notify("\n" +
                    "Premium user prompt: Server is fully down now. Service is now being provided by DEF company.\n");


        }




    }

    public void notifyRegularUser()
    {
        if(currentState.equalsIgnoreCase("partially down")&& prevState.equalsIgnoreCase("operational"))
        {
            regular_user.notify("Regular user prompt: Server is partially down now. Do you want to continue using the limited functionality or pay $20 per hour to enjoy the full functionality taking service from server of DEF company?\n" +
                    " In the 2nd case, all your data will be copied to the server of DEF company.\n");
            System.out.println (" Please choose:\n" +
                            "1. limited functionality\n" +
                            "2. pay for full functionality"
                    );

            Scanner scn=new Scanner(System.in);
            int x=scn.nextInt();
            return;


        }


        else if(currentState.equalsIgnoreCase("fully down")&& prevState.equalsIgnoreCase("partially down"))
        {

            regular_user.notify("Regular user prompt: Server is fully down now. ");

        }



        else if(currentState.equalsIgnoreCase("operational") && prevState.equalsIgnoreCase("fully down") )
        {
            regular_user.notify("\n" +
                    "Regular user prompt: Now the server is operational again. Your total bill: x taka \n");


        }



        else if(currentState.equalsIgnoreCase("fully down") && prevState.equalsIgnoreCase("operational") )
        {
            regular_user.notify("\n" +
                    "Regular user prompt: Server is fully down now. " +
                    "Do you want to pay $20 per hour to take service from the server of DEF company? Note that, " +
                    "it will copy all your data to the server of DEF company.\n");


            System.out.println("Please choose:\n" +
                    "1. yes, pay $20 per hour\n" +
                    "2. no");

            Scanner scn=new Scanner(System.in);
            int x=scn.nextInt();
            return;

        }


        else if(prevState.equalsIgnoreCase("partially down")&& currentState.equalsIgnoreCase("operational"))
        {


            regular_user.notify("\n" +
                    "Regular user prompt: Now the server is operational again. Your total bill: x taka \n");
        }








    }


}



