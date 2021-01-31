import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinkedList<Shakes> myorder=new LinkedList<Shakes>();
        boolean b=false;

        while(true)
        {


            System.out.println("O for beginning order");
            System.out.println("A for adding shakes");
            System.out.println("S for showing current order");
            System.out.println("P/E for placing order");
            System.out.println("T for terminating the process");
            System.out.println("Enter your choice:");
            Scanner scn=new Scanner(System.in);
            char c=scn.next().charAt(0);

            if(c=='O')
            {
              //  System.out.println(b);
                if(b==false) {
                    myorder = new LinkedList<Shakes>();

                    b = true;
                }

                else
                {
                    System.out.println("Already an ongoing order.If you want to add something look at the choices and enter A: ");
                }
            }


           else   if(c=='A')
            {
                if(b==true) {

                    Shakes sh;

                    System.out.println("1.chocolate 2.coffee 3.strawberry 4.Vanilla 5.zero.");
                    System.out.println("Enter:");
                    char ch = scn.next().charAt(0);
                    if (ch == '1') {
                        boolean lactose=true,candy=false,cookie=false;

                        System.out.println("Enter y for lactose free:");
                        char l=scn.next().charAt(0);
                        if(l=='y'||l=='Y')
                        {
                            lactose=false;
                        }

                        System.out.println("Enter y for candy on top:");
                        char cn=scn.next().charAt(0);
                        if(cn=='y'||cn=='Y')
                        {
                            candy=true;
                        }


                        System.out.println("Enter cookie on top:");
                        char ck=scn.next().charAt(0);
                        if(ck=='y'||ck=='Y')
                        {
                            cookie=true;
                        }



                        sh = new chocolate_shake();
                        ShakeShack sc = new ShakeShack();
                        sc.produceShake(sh,lactose,candy,cookie);
                        myorder.addLast(sh);


                    }
                    if (ch == '2') {
                        boolean lactose=true,candy=false,cookie=false;

                        System.out.println("Enter y for lactose free:");
                        char l=scn.next().charAt(0);
                        if(l=='y'||l=='Y')
                        {
                            lactose=false;
                        }

                        System.out.println("Enter y for candy on top:");
                        char cn=scn.next().charAt(0);
                        if(cn=='y'||cn=='Y')
                        {
                            candy=true;
                        }


                        System.out.println("Enter cookie on top:");
                        char ck=scn.next().charAt(0);
                        if(ck=='y'||ck=='Y')
                        {
                            cookie=true;
                        }



                        sh = new coffee_shake();
                        ShakeShack sc = new ShakeShack();
                        sc.produceShake(sh,lactose,candy,cookie);
                        myorder.addLast(sh);

                    }
                    if (ch == '3') {

                        boolean lactose=true,candy=false,cookie=false;

                        System.out.println("Enter y for lactose free:");
                        char l=scn.next().charAt(0);
                        if(l=='y'||l=='Y')
                        {
                            lactose=false;
                        }

                        System.out.println("Enter y for candy on top:");
                        char cn=scn.next().charAt(0);
                        if(cn=='y'||cn=='Y')
                        {
                            candy=true;
                        }


                        System.out.println("Enter cookie on top:");
                        char ck=scn.next().charAt(0);
                        if(ck=='y'||ck=='Y')
                        {
                            cookie=true;
                        }



                        sh = new strawberry_shake();
                        ShakeShack sc = new ShakeShack();
                        sc.produceShake(sh,lactose,candy,cookie);
                        myorder.addLast(sh);
                    }

                    if (ch == '4') {

                        boolean lactose=true,candy=false,cookie=false;

                        System.out.println("Enter y for lactose free:");
                        char l=scn.next().charAt(0);
                        if(l=='y'||l=='Y')
                        {
                            lactose=false;
                        }

                        System.out.println("Enter y for candy on top:");
                        char cn=scn.next().charAt(0);
                        if(cn=='y'||cn=='Y')
                        {
                            candy=true;
                        }


                        System.out.println("Enter cookie on top:");
                        char ck=scn.next().charAt(0);
                        if(ck=='y'||ck=='Y')
                        {
                            cookie=true;
                        }



                        sh = new vanilla_shake();
                        ShakeShack sc = new ShakeShack();
                        sc.produceShake(sh,lactose,candy,cookie);
                        myorder.addLast(sh);

                    }


                    if (ch == '5') {

                        boolean lactose=true,candy=false,cookie=false;

                        System.out.println("Enter y for lactose free:");
                        char l=scn.next().charAt(0);
                        if(l=='y'||l=='Y')
                        {
                            lactose=false;
                        }

                        System.out.println("Enter y for candy on top and otherwisw to ignore");
                        char cn=scn.next().charAt(0);
                        if(cn=='y'||cn=='Y')
                        {
                            candy=true;
                        }


                        System.out.println("Enter y for cookie on top and otherwise to ingnore");
                        char ck=scn.next().charAt(0);
                        if(ck=='y'||ck=='Y')
                        {
                            cookie=true;
                        }



                        sh = new zero_shake();
                        ShakeShack sc = new ShakeShack();
                        sc.produceShake(sh,lactose,candy,cookie);


                        myorder.addLast(sh);

                    }
                }

                else
                {
                    System.out.println("first enter O");
                }

                }

                else if(c=='S')
                {
                    int total_price=0;
                    for(int i=0;i<myorder.size();i++)
                    {
                         Shake_ingredients itr=myorder.get(i).getShakeingredients_me();
                         itr.show();
                         total_price+=myorder.get(i).price();


                    }
                    System.out.println("Total price= "+total_price);


                }









            else if(c=='P'|| c=='E')
            {

                if(b==true) {
                    if(myorder.size()==0)
                    {
                        System.out.println("Cannot place order because there must be at least one item");
                    }
                    else {
                        System.out.println("Order placed successfully");
                        b = false;
                    }
                }
                else
                {
                    System.out.println("There is no order to place");
                }

            }
            else if(c=='T'||c=='t')
                {
                    break;
                }
            else System.out.println("Wrong Choice");






        }







    }


}
