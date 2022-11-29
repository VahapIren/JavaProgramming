package day20_Arrays;

import java.util.Scanner;

public class AverageNumberScanner {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("How many number do you want to enter");
        int num=scan.nextInt();
        int[] numbers=new int[num];
        int sum=0;
        double average;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("enter "+(i+1)+". number");
            numbers[i]=scan.nextInt();
            sum+=numbers[i];
        }
        average=sum/num;
        System.out.println("average = " + average);


    }
}
