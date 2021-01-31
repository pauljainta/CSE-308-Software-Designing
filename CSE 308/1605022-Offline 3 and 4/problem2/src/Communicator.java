import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Communicator {
    protected Exam_Controller exam_controller;
    protected int id;
  Communicator(Exam_Controller exam_controller)
    {
        this.exam_controller=exam_controller;
    }
   abstract int getId();



}
class Examiner extends Communicator
{
    List<Integer> marks;
    public Examiner(Exam_Controller exam_controller,int id)
    {
        super(exam_controller);
        this.id =id;
    }
    int getId()
    {
        return id;
    }

    public void send(String msg, List<Student> students,List<Integer> marks)
    {
        if(msg.equalsIgnoreCase("marks here"))
        {
            System.out.println("Examiner prompt: Scripts and marks of student id 0,1,2,3,4" +
                    " have been sent to exam controller office.\n");
            exam_controller.send(this,msg,students,marks);


        }

        this.marks=marks;
    }
    public void notify(String msg,List<Student> restudents)
    {


        if(msg.equalsIgnoreCase("Re-Examine"))
        {
            System.out.print("Examiner Prompt:Exam scripts of id:");

            for(int i=0;i<restudents.size();i++) System.out.print(restudents.get(i).getId()+" ");


            System.out.print(" have been received for re-examine\n");

            for(int i=0;i<restudents.size();i++) {
                int randomInt = ThreadLocalRandom.current().nextInt(1, 100);
                if (randomInt <= 50) {
                    System.out.println("Marks of student id "+restudents.get(i).getId()+" unchanged");
                   // exam_controller.send(this, "ID: " + i + " Marks Unchanged", null, null);
                }
                else if (randomInt >= 51 && randomInt <= 75) {
                    System.out.print("Marks of student id "+restudents.get(i).getId()+" increased" +
                            " Previous mark "+marks.get(restudents.get(i).getId()));
                    int idx=restudents.get(i).getId();

                    int m = marks.get(idx);
                    m += 10;
                   // marks.remove(i);
                    marks.set(idx, m);
                    System.out.println(" Corrected marks are "+m);

                    //exam_controller.send(this, "ID: " + i + " Marks Increased,marks:" + m, null, null);
                } else {
                    System.out.print("Marks of student id "+restudents.get(i).getId()+" decreased" +
                            " Previous mark "+marks.get(restudents.get(i).getId()));
                    int idx=restudents.get(i).getId();

                    int m = marks.get(idx);
                    m -= 10;
                  //  marks.remove(i);
                    marks.set(idx, m);
                    System.out.println(" Corrected marks are "+m);

                   // exam_controller.send(this, "ID: " + i + " Marks Decreased,marks:" + m, null, null);
                }
            }
          //  for(int i=0;i<marks.size();i++) System.out.println(marks.get(i));
            exam_controller.send(this,"re-examine",restudents,marks);


        }

    }


}
class Student extends Communicator
{
    public Student(Exam_Controller exam_controller,int id)
    {
        super(exam_controller);
        this.id =id;
    }
    int getId()
    {
        return id;
    }
    public void send(String msg)
    {
      //  exam_controller.send(this,msg);
    }
    public void notify(String msg)
    {
            System.out.println(msg);


    }



}