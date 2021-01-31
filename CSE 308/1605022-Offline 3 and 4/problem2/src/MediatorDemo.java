

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MediatorDemo {


    public static void main(String[] args) {


            List<Student> students=new LinkedList<Student>();
            concreteExam_controller exam_controller = new concreteExam_controller();
            Student student1 = new Student(exam_controller, 0);
            Student student2=new Student(exam_controller,1);
            Student student3=new Student(exam_controller,2);
            Student student4=new Student(exam_controller,3);
            Student student5=new Student(exam_controller,4);
            students.add(student1);
            students.add(student2);
            students.add(student3);
            students.add(student4);
            students.add(student5);
            List<Integer> marks=new LinkedList<Integer>();
            marks.add(82);
            marks.add(78);
            marks.add(45);
            marks.add(23);
            marks.add(78);



            Examiner examiner = new Examiner(exam_controller, 12);
            exam_controller.setExaminer(examiner);
            exam_controller.setStudent(students);
            examiner.send("marks here",students,marks);
        /*while(true) {
            System.out.println("do you want to re-examine?\nEnter 1 if yes");
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
           if (x == 1) {
               Scanner scanner1=new Scanner(System.in);
               System.out.println("Enter student id:");
               int y=scanner1.nextInt();
               students.get(y).send("Re-Examine");


            }

        }*/






    }
}
