package day18_NestedLoop;

import java.util.Scanner;

public class MultiplyTwoNumbers {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=scan.nextInt();
        System.out.println("Enter second number");
        int num2=scan.nextInt();
        int counter=0;
        for (int i = 0; i < num2; i++) {
            counter+=num1;
        }
        System.out.println(counter);

    }
}
