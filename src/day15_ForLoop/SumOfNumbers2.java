package day15_ForLoop;

import java.util.Scanner;

public class SumOfNumbers2 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter a number");

        int num=scan.nextInt();
        for (int i = 1; i <=num; i++) {
            sum+=i;
        }
        System.out.println(sum);
        sum=0;
        System.out.println();
        for (int i = 2; i <=100; i+=2) {
            sum+=i;
        }
        System.out.println(sum);
    }
}
