package day18_NestedLoop;

import java.util.Scanner;

public class CalculateTwoNumbers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double result=0;
        while (true) {

            System.out.println("Enter the number1");
            int num1 = scan.nextInt();
            System.out.println("Enter a math operator");
            char op = scan.next().charAt(0);
            while (!(op == '+' || op == '-' || op == '*' || op == '/')) {
                System.out.println("Invalid Entry.Please re-enter");
                op = scan.next().charAt(0);
            }
            System.out.println("Enter the number2");
            int num2 = scan.nextInt();
            switch (op) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                case '/':
                    result = num1 / num2;


            }
            System.out.println(result);
            System.out.println("Do you want to continue?");
            String a = scan.next();
            while (!(a.equalsIgnoreCase("yes") || a.equalsIgnoreCase("no"))) {
                System.out.println("Invalid entry.Please re-enter");
                a = scan.next();
            }
            if (a.equalsIgnoreCase("yes")) {
                continue;

            }else {
                System.out.println("Thanks for using Cydeo calculator");
                break;
            }
        }
    }
}
