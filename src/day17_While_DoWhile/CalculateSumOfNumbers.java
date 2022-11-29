package day17_While_DoWhile;

import java.util.Scanner;

public class CalculateSumOfNumbers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sum=0;
        System.out.println("enter the numbers");


        while (true){
            int num=scan.nextInt();
            if (num>0) {
                sum += num;
            }else {
                break;
            }

        }
        System.out.println(sum);
    }
}
