package day19_LoopPractices;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while (true) {
            System.out.println("enter the length of rectangle");
            int length = scan.nextInt();
            if (length <=0){
                System.err.println("Invalid Entry");
                System.exit(0);
            }
            System.out.println("enter the width of rectangle");
            int width = scan.nextInt();
            if (width <=0){
                System.err.println("Invalid Entry");
                System.exit(0);
            }

            System.out.println("Area of rectangle:"+(length * width));
            System.out.println("Perimeter of rectangle:"+(2* (length +width)));

            System.out.println("Would you like to calculate another rectangle?yes/no");
            String answer=scan.next();
            while (!(answer.equals("yes")||answer.equals("no"))){
                System.out.println("Invalid Entry.Please re-enter");
                answer=scan.next();
            }
            if (answer.equals("yes")){
                continue;
            }else {
                System.out.println("Thank you for using Cydeo Rectangle Calculator");
                break;
            }






        }

    }
}
