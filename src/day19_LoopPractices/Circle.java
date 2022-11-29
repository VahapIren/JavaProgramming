package day19_LoopPractices;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double pi=3.14;
        while (true) {
            System.out.println("enter the radius of circle");
            int radius = scan.nextInt();
            if (radius<=0){
                System.err.println("Invalid Entry");
                System.exit(0);
            }
            System.out.println("Diameter of circle:"+(radius*2));
            System.out.println("Area of circle:"+(radius*radius*pi));
            System.out.println("Perimeter of circle:"+(2*radius*pi));

            System.out.println("Would you like to calculate another circle?yes/no");
            String answer=scan.next();
            while (!(answer.equals("yes")||answer.equals("no"))){
                System.out.println("Invalid Entry.Please re-enter");
                answer=scan.next();
            }
            if (answer.equals("yes")){
                continue;
            }else {
                System.out.println("Thank you for using Cydeo Circle Calculator");
                break;
            }






        }

    }
}
