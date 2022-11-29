package day19_LoopPractices;

import java.util.Scanner;

public class OddOrEvenNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while (true) {
            System.out.println("enter a number");
            int num = scan.nextInt();
            if (num % 2 == 0) {
                System.out.println("Even number");
            } else {

                System.out.println("Odd number");
            }
            System.out.println("Would you like to enter another number?yes/no");
            String a = scan.next();
            if (!(a.equalsIgnoreCase("no") || a.equalsIgnoreCase("yes"))) {
                System.err.println("Invalid Entry");
                System.exit(0);
            }


            if ((a.equalsIgnoreCase("no"))) {
                System.out.println("Thank You!");
                break;

            }

        }
    }
}
