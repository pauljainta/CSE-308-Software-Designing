import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        while(true){
        Scanner scn = new Scanner(System.in);
        System.out.println("1.Computer A 2.Computer B 3.Computer C 4.Exit  Enter choice:");
        int c = scn.nextInt();
        if (c == 1) {
            System.out.println("1.Circle 2.Rectangle 3.Square 4.Triangle. Enter choice:");
            int s = scn.nextInt();
            if (s == 1) {
                Computer computer = Factory.getComputer("computer A");
                SHAPE shape = computer.getShape("circle");
                if(shape!=null)
                shape.show();

            } else if (s == 2) {
                Computer computer = Factory.getComputer("computer A");
                SHAPE shape = computer.getShape("rectangle");
                if(shape!=null)
                shape.show();

            } else if (s == 3) {
                Computer computer = Factory.getComputer("computer A");
                SHAPE shape = computer.getShape("square");
                if(shape!=null)
                shape.show();
            } else if (s == 4) {
                Computer computer = Factory.getComputer("computer A");
                SHAPE shape = computer.getShape("triangle");
                if(shape!=null)
                shape.show();
            } else System.out.println("wrong input");

        } else if (c == 2) {
            System.out.println("1.Circle 2.Rectangle 3.Square 4.Triangle. Enter choice:");
            int s = scn.nextInt();
            if (s == 1) {
                Computer computer = Factory.getComputer("computer B");
                SHAPE shape = computer.getShape("circle");
                if(shape!=null)
                shape.show();

            } else if (s == 2) {
                Computer computer = Factory.getComputer("computer B");
                SHAPE shape = computer.getShape("rectangle");
                if(shape!=null)
                shape.show();

            } else if (s == 3) {
                Computer computer = Factory.getComputer("computer B");
                SHAPE shape = computer.getShape("square");
                if(shape!=null)
                shape.show();
            } else if (s == 4) {
                Computer computer = Factory.getComputer("computer B");
                SHAPE shape = computer.getShape("triangle");
                if(shape!=null)
                shape.show();
            } else System.out.println("wrong input");


        } else if (c == 3) {
            System.out.println("1.Circle 2.Rectangle 3.Square 4.Triangle. Enter choice:");
            int s = scn.nextInt();
            if (s == 1) {
                Computer computer = Factory.getComputer("computer C");
                SHAPE shape = computer.getShape("circle");
                if(shape!=null)
                shape.show();

            } else if (s == 2) {
                Computer computer = Factory.getComputer("computer C");
                SHAPE shape = computer.getShape("rectangle");
                if(shape!=null)
                shape.show();

            } else if (s == 3) {
                Computer computer = Factory.getComputer("computer C");
                SHAPE shape = computer.getShape("square");
                if(shape!=null)
                shape.show();
            } else if (s == 4) {
                Computer computer = Factory.getComputer("computer C");
                SHAPE shape = computer.getShape("triangle");
                if(shape!=null)
                shape.show();
            } else System.out.println("wrong input");


        }

        else if(c==4) break;

        else System.out.println("wrong input ,try again");


    }


    }
}
