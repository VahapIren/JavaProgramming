package day19_LoopPractices;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while (true) {
            System.out.println("enter the side of the square");
            int side = scan.nextInt();
            if (side <=0){
                System.err.println("Invalid Entry");
                System.exit(0);
            }
            System.out.println("Area of square:"+(side * side ));
            System.out.println("Perimeter of square:"+(4* side ));

            System.out.println("Would you like to calculate another square?yes/no");
            String answer=scan.next();
            while (!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))){
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
