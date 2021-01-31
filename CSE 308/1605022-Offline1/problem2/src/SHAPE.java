public interface SHAPE {

    void show();
}



class Circle implements SHAPE
{
    double surface_area,perimeter,radius;
    String company,mmu,cpu;
    Circle(double r,String comp,String cp,String mm)
    {
        company=comp;
        cpu=cp;
        mmu=mm;
        radius=r;
        surface_area= 3.1416*r*r;
        perimeter=2*3.1416*r;
    }






    public void show()
    {
        System.out.println("The Shape is Circle");
        System.out.println(company+" "+mmu+" "+cpu);
        System.out.println("Surface Area "+surface_area);
        System.out.println("Perimeter "+perimeter);

    }



}

class Square implements SHAPE
{
    double surface_area,perimeter,side;
    String company,mmu,cpu;
    Square(double s,String comp,String cp,String mm)
    {
        company=comp;
        cpu=cp;
        mmu=mm;
        side=s;
        surface_area=s*s;
        perimeter=4.0*s;
    }



    public void show()
    {
        System.out.println("The Shape is Square");
        System.out.println(company+" "+mmu+" "+cpu);
        System.out.println("Surface Area "+surface_area);
        System.out.println("Perimeter "+perimeter);

    }



}


class Rectangle implements SHAPE
{

    double surface_area,perimeter,length,width;
    String company,mmu,cpu;
    Rectangle(double l,double w,String comp,String cp,String mm)
    {
        company=comp;
        cpu=cp;
        mmu=mm;
        length=l;
        width=w;
        surface_area=l*w;
        perimeter=2.0*(l+w);

    }



    public void show()
    {
        System.out.println("The Shape is Rectangle");
        System.out.println(company+" "+mmu+" "+cpu);
        System.out.println("Surface Area "+surface_area);
        System.out.println("Perimeter "+perimeter);

    }

}


class Triangle implements SHAPE
{
    double surface_area,perimeter,base,sideb,sidec,height;
    String company,mmu,cpu;
    Triangle(double b,double sb,double sc,double h,String comp,String cp,String mm)
    {
        company=comp;
        cpu=cp;
        mmu=mm;
        base=b;
        sideb=sb;
        sidec=sc;
        height=h;
        surface_area=0.5*base*height;
        perimeter=base+sidec+sideb;
    }



    public void show()
    {
        System.out.println("The Shape is Triangle");
        System.out.println(company+" "+mmu+" "+cpu);
        System.out.println("Surface Area "+surface_area);
        System.out.println("Perimeter "+perimeter);

    }


}



