package day24_CustomMethod_Return;

import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("How many numbers?");
        int num=scan.nextInt();
        System.out.println("Please enter the numbers");
        int[] numbers=new int[num];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=scan.nextInt();
        }
        System.out.println("Max number is "+maxNumber(numbers));
    }
    public static int maxNumber(int[] numbers){
        int max=numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>max){
                max=numbers[i];
            }

        }
        return max;
    }

}
