package day23_CustomMethods_Void;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number");
        int number=scan.nextInt();
        posNegZero(number);

    }
    public static void posNegZero(int num){
        if (num>0){
            System.out.println(num+" is Positive");
        } else if (num<0) {
            System.out.println(num+" is Negative");
        }else {
            System.out.println(num+" is Zero");
        }
    }

}
