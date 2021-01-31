import java.util.Scanner;



public interface Computer {

     SHAPE getShape(String shape);
}

class ComputerA implements Computer
{

    private String comp_name;
    private String res;
    CPU cpu;
    MMU mmu;

   public ComputerA()
    {
       comp_name="Computer A";
       cpu=new CPU_A();
       mmu=new MMU_A();
       res="200x200";


    }
  public SHAPE getShape(String shape)
    {
        if(shape.equalsIgnoreCase("circle"))
        {
            System.out.println("Enter Radius:");
            Scanner scn=new Scanner(System.in);
            double r=scn.nextDouble();
            if(r*2>200) {
                System.out.println("Cannot display");
                return null;
            }
            else
            return new Circle(r,"computer A res "+res,"Cpu A","Mmu A");
        }

       else if(shape.equalsIgnoreCase("rectangle"))
        {
            Scanner scn=new Scanner(System.in);
            System.out.println("Enter lenght:");
            double l=scn.nextDouble();
            System.out.println("Enter width:");
            double w=scn.nextDouble();
            if(l>200||w>200)
            {
                System.out.println("Cannot display");
                return null;
            }
            return new Rectangle(l,w,"computer A res "+res,"Cpu A","Mmu A");
        }

       else if(shape.equalsIgnoreCase("triangle"))
        {
            Scanner scn=new Scanner(System.in);
            System.out.println("Enter Base:");
            double b=scn.nextDouble();
            System.out.println("Enter height:");
            double h=scn.nextDouble();
            System.out.println("Enter Other Side B:");
            double sb=scn.nextDouble();
            System.out.println("Enter Other Side C:");
            double sc=scn.nextDouble();
            if(b>200||h>200)
            {
                System.out.println("Cannot display");
                return null;
            }

            return new Triangle(b,sb,sc,h,"computer A res "+res,"Cpu A","Mmu A");
        }
        if(shape.equalsIgnoreCase("square"))
        {
            Scanner scn=new Scanner(System.in);
            System.out.println("Enter Side:");
            double s=scn.nextDouble();
            if(s>200)
            {
                System.out.println("Cannot display");
                return null;
            }
            return new Square(s,"computer A res "+res,"Cpu A","Mmu A");
        }
        return null;

    }
}



class ComputerB implements Computer
{

    private String comp_name;
    private String res;
    CPU cpu;
    MMU mmu;

    public ComputerB()
    {
        comp_name="Computer B";
        cpu=new CPU_B();
        mmu=new MMU_B();
        res="350x250";


    }
    public SHAPE getShape(String shape)
    {
        if(shape.equalsIgnoreCase("circle"))
        {
            System.out.println("Enter Radius:");
            Scanner scn=new Scanner(System.in);
            double r=scn.nextDouble();
            if(r*2>250) {
                System.out.println("Cannot display");
                return null;
            }
            else
            return new Circle(r,"computer B res "+res,"Cpu B","Mmu B");
        }

        else if(shape.equalsIgnoreCase("rectangle"))
        {
            Scanner scn=new Scanner(System.in);
            System.out.println("Enter lenght:");
            double l=scn.nextDouble();
            System.out.println("Enter width:");
            double w=scn.nextDouble();
            if(l>350||w>250)
            {
                System.out.println("Cannot display");
                return null;
            }
            return new Rectangle(l,w,"computer B res "+res,"Cpu B","Mmu B");
        }

        else if(shape.equalsIgnoreCase("triangle"))
        {
            Scanner scn=new Scanner(System.in);
            System.out.println("Enter Base:");
            double b=scn.nextDouble();
            System.out.println("Enter height:");
            double h=scn.nextDouble();
            System.out.println("Enter Other Side B:");
            double sb=scn.nextDouble();
            System.out.println("Enter Other Side C:");
            double sc=scn.nextDouble();
            if(b>350||h>250)
            {
                System.out.println("Cannot display");
                return null;
            }

            return new Triangle(b,sb,sc,h,"computer B res "+res,"Cpu B","Mmu B");
        }
        if(shape.equalsIgnoreCase("square"))
        {
            Scanner scn=new Scanner(System.in);
            System.out.println("Enter Side:");
            double s=scn.nextDouble();

            if(s>250)
            {
                System.out.println("Cannot display");
                return null;
            }
            return new Square(s,"computer B res "+res,"Cpu B","Mmu B");
        }
        return null;

    }
}








class ComputerC implements Computer
{

    private String comp_name;
    private String res;
    CPU cpu;
    MMU mmu;

    public ComputerC()
    {
        comp_name="Computer C";
        cpu=new CPU_C();
        mmu=new MMU_C();
        res="550x430";


    }
    public SHAPE getShape(String shape)
    {
        if(shape.equalsIgnoreCase("circle"))
        {
            System.out.println("Enter Radius:");
            Scanner scn=new Scanner(System.in);
            double r=scn.nextDouble();

            if(r*2>430) {
                System.out.println("Cannot display");
                return null;
            }
            else
            return new Circle(r,"computer C res "+res,"Cpu C","Mmu C");
        }

        else if(shape.equalsIgnoreCase("rectangle"))
        {
            Scanner scn=new Scanner(System.in);
            System.out.println("Enter lenght:");
            double l=scn.nextDouble();
            System.out.println("Enter width:");
            double w=scn.nextDouble();
            if(l>550||w>430)
            {
                System.out.println("Cannot display");
                return null;
            }
            return new Rectangle(l,w,"computer C res "+res,"Cpu C","Mmu C");
        }

        else if(shape.equalsIgnoreCase("triangle"))
        {
            Scanner scn=new Scanner(System.in);
            System.out.println("Enter Base:");
            double b=scn.nextDouble();
            System.out.println("Enter height:");
            double h=scn.nextDouble();
            System.out.println("Enter Other Side B:");
            double sb=scn.nextDouble();
            System.out.println("Enter Other Side C:");
            double sc=scn.nextDouble();
            if(b>550||h>430)
            {
                System.out.println("Cannot display");
                return null;
            }
            return new Triangle(b,sb,sc,h,"computer C res "+res,"Cpu C","Mmu C");
        }
        if(shape.equalsIgnoreCase("square"))
        {
            Scanner scn=new Scanner(System.in);
            System.out.println("Enter Side:");
            double s=scn.nextDouble();
            if(s>430)
            {
                System.out.println("Cannot display");
                return null;
            }

            return new Square(s,"computer C res "+res,"Cpu C","Mmu C");
        }
        return null;

    }
}

abstract class CPU
{

}

class CPU_A extends CPU
{
    CPU_A()
    {
        System.out.println("Insering CPU A to computer A");

    }
}


class CPU_B extends CPU
{
    CPU_B()
    {
        System.out.println("Insering CPU B to computer B");
    }
}


class CPU_C extends CPU
{
    CPU_C()
    {
        System.out.println("Insering CPU C to computer C");

    }
}



abstract class MMU
{

}

class MMU_A extends MMU
{
    MMU_A()
    {
        System.out.println("Insering MMU A to computer A");

    }
}


class MMU_B extends MMU
{
    MMU_B()
    {
        System.out.println("Insering MMU B to computer B");

    }
}


class MMU_C extends MMU
{
    MMU_C()
    {
        System.out.println("Insering MMU C to computer C");

    }
}
















