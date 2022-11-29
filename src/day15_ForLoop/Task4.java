package day15_ForLoop;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int input=scan.nextInt();
        int fact=1;
        for (int i = 1; i <=input ; i++) {
            fact*=i;
        }
        System.out.println(fact);
    }
}
