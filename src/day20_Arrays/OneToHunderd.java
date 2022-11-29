package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class OneToHunderd {
    public static void main(String[] args) {

        int[] numbers=new int[100];
        for (int i = 0,j=1; i < numbers.length; i++,j++) {
            numbers[i]=j;
        }
        System.out.println(Arrays.toString(numbers));

        int[] reverseNumbers=new int[100];
        for (int i = 0,j=100; i < reverseNumbers.length; i++,j--) {
            reverseNumbers[i]=j;
        }
        System.out.println(Arrays.toString(reverseNumbers));


        Scanner scan=new Scanner(System.in);
        int num[]=new int[10];

        for (int i = 0; i < num.length; i++) {
            System.out.println("enter a number");
            num[i]=scan.nextInt();

            }
        int max=num[0];
        int min=num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i]>max){
                max=num[i];
            }
            if (num[i]<min){
                min=num[i];
            }
        }


        System.out.println(Arrays.toString(num));
        System.out.println(max);
        System.out.println(min);

    }
}
