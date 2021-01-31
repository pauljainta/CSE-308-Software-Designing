import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public interface Exam_Controller {

 void send(String msg);
 void send(Communicator communicator, String msg,List<Student> students,List<Integer> marks);


}
class concreteExam_controller implements Exam_Controller
{
   private List<Student> students,restudents;
   private Examiner examiner;
   private List<Integer> oldMarks;
  // Communicator re_examiner;

    public void setStudent(List<Student> students) {
        this.students = students;
        restudents=new LinkedList<Student>();
        oldMarks=new LinkedList<Integer>();
    }

    public void setExaminer(Examiner examiner) {
        this.examiner = examiner;
    }

    @Override
    public void send( String msg) {

        if (msg.equalsIgnoreCase("Re-Examine"))
        {

            examiner.notify(msg,restudents);

        }

    }

    @Override
    public void send(Communicator communicator, String msg,List<Student> students,List<Integer> marks) {

            if(msg.equalsIgnoreCase("Marks Here"))
           {


               System.out.println("Exam controller prompt: Scripts and marks of student id" +
                       " 0,1,2,3,4 have been received. \n");
               for(int i=0;i<students.size();i++)
               {

                   System.out.println("Id: "+students.get(i).getId()+" mark "+marks.get(i));

               }

               System.out.println("Scrutinization has been done. Marks of student id 4 were incorrect. \n" +
                       "Previous marks: "+ marks.get(4)+", Corrected marks: 52\n");
               marks.set(4,52);
              // oldMarks=marks;

               oldMarks.add(marks.get(0));
               oldMarks.add(marks.get(1));
               oldMarks.add(marks.get(2));
               oldMarks.add(marks.get(3));
               oldMarks.add(marks.get(4));



               //System.out.println("in here");
               examiner.send("",students,marks);
               System.out.println("Result has been published to the students. \n");
               for(int i=0;i<students.size();i++)
               {

                   students.get(i).notify("Student "+i+" Prompt:Result Published  " +
                           "  got marks "+marks.get(i));
                   System.out.println("Do you want to apply for re-examine?\n 1.yes 2.No");
                   Scanner scanner = new Scanner(System.in);
                   int x = scanner.nextInt();
                   if(x==1) restudents.add(students.get(i));

               }
               if(restudents.size()!=0) {
                   System.out.println("Re-Examine request sent ");
                   System.out.print("Exam Controller Prompt:Re-Examine Request got from id:");
                   for(int i=0;i<restudents.size();i++) System.out.print(restudents.get(i).getId()+" ");
                   System.out.println("\nExam script of  these student ids have been sent to the examiner");
                   this.send("RE-Examine");
               }

           }


           else if(msg.equalsIgnoreCase("re-examine"))
           {
              // for(int i=0;i<marks.size();i++) System.out.println(marks.get(i));

               //for(int i=0;i<oldMarks.size();i++) System.out.println(oldMarks.get(i));


               System.out.print("Exam-Controller Prompt:");
               for(int i=0;i<restudents.size();i++)
               {

                   int idx=restudents.get(i).getId();
                   int newmark=marks.get(idx);
                   int oldmark=oldMarks.get(idx);
                   if(newmark==oldmark)
                   {
                       System.out.println("marks of student id "+idx+" unchanged");
                   }
                   else
                   {
                       System.out.println("marks of student id "+idx+" updated from "+oldmark+" to "+newmark);


                   }

               }

               System.out.println("Corresponding students have been informed about re-examined results");


               for(int i=0;i<restudents.size();i++)
               {

                   int idx=restudents.get(i).getId();
                   int newmark=marks.get(idx);
                   int oldmark=oldMarks.get(idx);
                   if(newmark==oldmark)
                   {
                       students.get(idx).notify("Student "+idx+" prompt: Marks unchanged");
                   }
                   else
                   {
                       students.get(idx).notify(" Student "+idx+"prompt: marks changed from "+oldmark+" to "+newmark);


                   }

               }



           }



    }
}