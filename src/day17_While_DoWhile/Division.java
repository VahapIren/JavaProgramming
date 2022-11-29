package day17_While_DoWhile;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter two number");
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        int count=0,division=num1;
        for (int i = 0; i <num1 ; i++) {
            if (division>0) {
                division -= num2;
                count++;
            }
        }
        System.out.println(count);

    }
}
