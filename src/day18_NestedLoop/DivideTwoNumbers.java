package day18_NestedLoop;

import java.util.Scanner;

public class DivideTwoNumbers {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=scan.nextInt();
        System.out.println("Enter second number");
        int num2=scan.nextInt();
        int counter=0;
        while (!(num1<num2)){
            num1-=num2;
            counter++;
        }
        System.out.println(counter);
        System.out.println(num1);



    }
}
