package day16_ForLoopStringPractice;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int pos=0,neg=0;
        System.out.println("Enter 5 number ");
        for (int i = 0; i < 5; i++) {
            int num=scan.nextInt();
            if (num>0){
                pos++;
            } else if (num<0) {
                neg++;
            }
        }
        System.out.println("pos = " + pos);
        System.out.println("neg = " + neg);
    }
}
