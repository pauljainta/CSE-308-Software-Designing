import java.util.LinkedList;

public interface Shakes {


    void constructShakes(boolean lactose, boolean candy, boolean cookie);
    public  int price();
    public Shake_ingredients getShakeingredients_me();
}
class chocolate_shake implements Shakes
{
    int p=230;


    private Shake_ingredients shakeingredients_me =new Shake_ingredients();


    public void constructShakes(boolean lactose, boolean candy, boolean cookie)
    {
        shakeingredients_me.add("Chocolate Shake Base 230");
        if(lactose ==true) {
            shakeingredients_me.add("Milk");
        }
        else
        {
            shakeingredients_me.add("Almond Milk extra 60");
            p+=60;
        }
        if(candy==true)
        {
            shakeingredients_me.add("Candy on top extra 50");
            p+=50;
        }
        if(cookie==true) {
            shakeingredients_me.add("Cookie on top extra 40");
            p+=40;
        }
        shakeingredients_me.add("Sugar");
        shakeingredients_me.add("chocolate syrup");
        shakeingredients_me.add("chocolate icecream");


    }


     public int price()
    {
        return p;

    }
    public Shake_ingredients getShakeingredients_me(){return shakeingredients_me;}

}


class coffee_shake implements Shakes
{
    int p=230;
    private Shake_ingredients shakeingredients_me =new Shake_ingredients();

    public void constructShakes(boolean lactose, boolean candy, boolean cookie)
    {
        shakeingredients_me.add("Coffee Shake base 230");


        if(lactose ==true) {
            shakeingredients_me.add("Milk");
        }
        else
        {
            shakeingredients_me.add("Almond Milk extra 60");
            p+=60;
        }
        if(candy==true)
        {
            shakeingredients_me.add("Candy on top extra 50");
            p+=50;
        }
        if(cookie==true) {
            shakeingredients_me.add("Cookie on top extra 40");
            p+=40;

        }
        shakeingredients_me.add("Sugar");
        shakeingredients_me.add("coffee");
        shakeingredients_me.add("jello");

    }



    public int price()
    {
        return p;

    }


    public Shake_ingredients getShakeingredients_me(){return shakeingredients_me;}



}



class vanilla_shake implements Shakes
{
    int p=190;
    private Shake_ingredients shakeingredients_me =new Shake_ingredients();

    public void constructShakes(boolean lactose, boolean candy, boolean cookie)
    {
        shakeingredients_me.add("Vanilla base 190");
        if(lactose ==true) {
            shakeingredients_me.add("Milk");
        }
        else
        {
            shakeingredients_me.add("Almond Milk extra 60 ");
            p+=60;
        }

        if(candy==true)
        {
            shakeingredients_me.add("Candy on top extra 50");
            p+=50;
        }
        if(cookie==true) {
            shakeingredients_me.add("Cookie on top extra 40");
            p+=40;

        }


        shakeingredients_me.add("Sugar");
        shakeingredients_me.add("vanilla flavouring");
        shakeingredients_me.add("jello");



    }



    public int price()
    {
        return p;

    }

    public Shake_ingredients getShakeingredients_me(){return shakeingredients_me;}


}






class strawberry_shake implements Shakes
{
    int p=200;
    private Shake_ingredients shakeingredients_me =new Shake_ingredients();

    public void constructShakes(boolean lactose, boolean candy, boolean cookie)
    {
        shakeingredients_me.add("Strawberry Base 200");

        if(lactose ==true) {
            shakeingredients_me.add("Milk");
        }
        else
        {
            shakeingredients_me.add("Almond Milk extra 60");
            p+=60;
        }

        if(candy==true)
        {
            shakeingredients_me.add("Candy on top extra 50");
            p+=50;
        }
        if(cookie==true) {
            shakeingredients_me.add("Cookie on top extra 40");
            p+=40;

        }

        shakeingredients_me.add("Sugar");
        shakeingredients_me.add("strawberry syrup");
        shakeingredients_me.add("strawberry icecream");

    }


   public int price()
    {
        return p;
    }

    public Shake_ingredients getShakeingredients_me(){return shakeingredients_me;}



}







class zero_shake implements Shakes
{
    int p=240;
    private Shake_ingredients shakeingredients_me =new Shake_ingredients();
    public void constructShakes(boolean lactose, boolean candy, boolean cookie)
    {

        shakeingredients_me.add("zero Shake_ingredients  base 240");
        if(lactose ==true) {
            shakeingredients_me.add("Milk");
        }
        else
        {
            shakeingredients_me.add("Almond Milk extra 60");
            p+=60;
        }
        if(candy==true)
        {
            shakeingredients_me.add("Candy on top extra 50");
            p+=50;
        }
        if(cookie==true) {
            shakeingredients_me.add("Cookie on top extra 40");
            p+=40;

        }

        shakeingredients_me.add("sweetener");
        shakeingredients_me.add("vanilla flavouring");
        shakeingredients_me.add("sugar free jello");


    }


     public   int price()
    {
       return p;
    }

    public Shake_ingredients getShakeingredients_me(){return shakeingredients_me;}



}






class Shake_ingredients
{

  private LinkedList<String> ingredients;
  public Shake_ingredients()
  {
      ingredients=new LinkedList<String>();
  }

  public void add(String s)
  {

      ingredients.addLast(s);

  }

 public  void show()
  {


    for(int i=0;i<ingredients.size();i++)
    {

        System.out.println(ingredients.get(i));
    }


  }


}




class ShakeShack
{

    Shakes myshake;


   public void produceShake(Shakes sh, boolean lactose, boolean candy, boolean cookie)
   {

       myshake=sh;
       sh.constructShakes(lactose,candy,cookie);



   }




}






