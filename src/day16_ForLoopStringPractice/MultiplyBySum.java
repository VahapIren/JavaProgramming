package day16_ForLoopStringPractice;

import java.util.Scanner;

public class MultiplyBySum {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int mul=0;
        System.out.println("Enter two positive numbers");
        int a=scan.nextInt();
        int b=scan.nextInt();
        if (a>0&&b>0){
            for (int i = 0; i < b; i++) {
                mul+=a;
            }
        }else {
            System.out.println("Invalid Number");
        }
        System.out.println(mul);

    }
}
