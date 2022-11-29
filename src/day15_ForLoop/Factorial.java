package day15_ForLoop;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int factorial =1;
        System.out.println("Enter a number");
        int num=scan.nextInt();
        for (int i = num; i >0 ; i--) {
            factorial *=i;
        }
        System.out.println(factorial);
    }
}
