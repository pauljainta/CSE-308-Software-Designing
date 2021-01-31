public interface User {
 void notify(String msg);

}
class Premium_user implements User
{
    String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
 //       System.out.println("Server: "+state);
    }

    @Override
public void notify(String msg)
 {
     System.out.println(msg);

 }
}
class Regular_user implements User
{
    String state;
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
   //     System.out.println("Server: "+state);
    }

    @Override
    public void notify(String msg) {
        System.out.println(msg);
    }
}
