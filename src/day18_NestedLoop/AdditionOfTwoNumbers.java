package day18_NestedLoop;

import java.util.Scanner;

public class AdditionOfTwoNumbers {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        while (true) {
            System.out.println("Enter first number");
            int num1 = scan.nextInt();
            System.out.println("Enter second number");
            int num2 = scan.nextInt();
            System.out.println("Addition: " + (num1 + num2));
            System.out.println("would you like to continue");
            String a=scan.next().toLowerCase();

            while (!(a.equals("yes")||a.equals("no"))) {
                System.out.println("Invalid entry. please enter again");
                a = scan.next().toLowerCase();

            }
            if (a.equals("no")){
                break;
            }
        }


    }
}
