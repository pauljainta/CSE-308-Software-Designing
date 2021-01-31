

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public interface Component {


    int getComponent_count();
    void setComponent_count(int x);
    void add(Component c);
    void remove();
    String getName();
    String getType();
    String getPath();
    void list();
    void details();
    void setPath(String p);
    void setparent(Component c);
    Component getparent();


}

class Drive implements Component
{
    Component parent;
   int component_count;
   String name;
   String type;
   String path;
   List<Component> children =new ArrayList<Component>();
   public Drive(String n) {


       name = n;
       type = "drive";
       path =name;
       component_count = 0;
       parent=null;

       System.out.println("Drive "+name+" created");
   }
   @Override
   public  void setPath(String p)
   {
       path =name;


   }


    @Override
    public void add(Component c) {
        children.add(c);
        component_count++;
        c.setPath(path);
        c.setparent(this);

    }

    @Override
    public void remove() {
        Iterator<Component> it=children.iterator();
        for(int i=0;i<children.size();i++)
        {

            children.remove(i);

        }
        System.out.println(getType()+" "+getName()+" Deleted");
        this.name=null;
        this.type=null;
        this.path=null;
        this.component_count=0;



    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPath() {
        return path;
    }

    @Override
    public String getType() {
        return type;
    }

    public int getComponent_count() {
        return component_count;
    }

    public void setComponent_count(int component_count) {
        this.component_count = component_count;
    }

    @Override
    public void details() {
       if(name!=null) {
           System.out.println("Name: " + name);
           System.out.println("Type: " + type);
           System.out.println("Directory: " + path);
           System.out.println("Component_Count: " + component_count);
       }
    }
    @Override
    public  void setparent(Component c)
    {

    }
    @Override
    public Component getparent()
    {
        return  null;
    }

    @Override
    public void list() {
       if(name!=null) {
           System.out.println("----------------------------");
           System.out.println("Name: " + getName());
           System.out.println("Type: " + getType());
           System.out.println("Component_Count: " + getComponent_count());
           System.out.println("Directory: " + path);

           System.out.println("----------------------------");


           Iterator<Component> it = children.iterator();
           while (it.hasNext()) {

               Component c = it.next();
               c.list();
           }
       }


    }
}
class folder implements Component
{
    int component_count;
    Component parent;
    String name;
    String type;
    String path;
    List<Component> children=new ArrayList<Component>();
    public folder(String n) {


        name = n;
        type = "folder";
        component_count = 0;
        System.out.println("folder "+name+" created");
    }
    @Override
    public void setPath(String p)
    {
        path =p+":"+name;

    }

    public int getComponent_count() {
        return component_count;
    }

    public void setComponent_count(int component_count) {
        this.component_count = component_count;
    }

    @Override
    public void setparent(Component c) {
        parent=c;
    }

    @Override
    public Component getparent() {
        return parent;
    }

    @Override
    public void add(Component c) {
        children.add(c);
        component_count++;
        c.setPath(path);
        c.setparent(this);
    }

    @Override
    public void remove() {

       /* Iterator<Component> it=children.iterator();
        while(it.hasNext())
        {

            Component c=it.next();
            children.remove(c);
        }*/
      // this.getparent().
       for(int i=0;i<children.size();i++)
       {

           children.remove(i);

       }
        System.out.println(getType()+" "+getName()+" Deleted");
        this.name=null;
        this.type=null;
        this.path=null;
        this.component_count=0;
        this.getparent().setComponent_count(this.getparent().getComponent_count()-1);
        this.setparent(null);



    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPath() {
        return path;
    }

    @Override
    public String getType() {
        return type;
    }



    @Override
    public void details() {
        if(name!=null) {
            System.out.println("Name: " + name);
            System.out.println("Type: " + type);
            System.out.println("Directory: " + path);
            System.out.println("Component_Count: " + component_count);
        }
    }

    @Override
    public void list() {
        if(name!=null) {
            System.out.println("----------------------------");
            System.out.println("Name: " + getName());
            System.out.println("Type: " + getType());
            System.out.println("Component_Count: " + getComponent_count());
            System.out.println("Directory: " + path);

            System.out.println("----------------------------");


            Iterator<Component> it = children.iterator();
            while (it.hasNext()) {

                Component c = it.next();
                c.list();
            }
        }


    }
}



class file implements Component
{
    String name;
    String type;
    String path;
    Component parent;

    public file(String n) {


        name = n;
        type = "file";
        System.out.println("file "+name+" created");

        //  path = p;
    }
    @Override
    public void setPath(String p)
    {
        path =p+":"+name;

    }

    @Override
    public void setparent(Component c) {
        parent=c;
    }

    @Override
    public Component getparent() {
        return parent;
    }

    @Override
    public void add(Component c) {

    }

    @Override
    public void remove() {
        System.out.println(getType()+" "+getName()+" deleted");
        this.name=null;
        this.type=null;
        this.path=null;
        this.getparent().setComponent_count(this.getparent().getComponent_count()-1);
        this.setparent(null);





    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPath() {
        return path;
    }

    @Override
    public String getType() {
        return type;
    }


    public int getComponent_count() {
        return 0;
    }

    public void setComponent_count(int component_count) {
       // this.component_count = component_count;
    }

    @Override
    public void details() {
        if(name!=null) {
            System.out.println("Name: " + name);
            System.out.println("Type: " + type);
            System.out.println("Directory: " + path);
        }
    }

    @Override
    public void list() {
        if(name!=null) {
            System.out.println("----------------------------");
            System.out.println("Name: " + getName());
            System.out.println("Type: " + getType());
            System.out.println("Directory: " + path);

            System.out.println("----------------------------");
        }





    }
}