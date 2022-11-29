package day21_ForEachLoop;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        String [] names={"Cydeo School","Wooden Spoon","Java Programming","SQL Programming","Selenium Automation",
                "API Testing","Dtabase Testing","Manual Testing"};
        int[] numbers={1,2,3,4,5,6,7,8};
        int[] reversed =new int[numbers.length];
        System.out.println(Arrays.toString(reversed));
        for (int i = numbers.length-1,j=0; i >=0 ; i--,j++) {

                reversed[j]=numbers[i];
        }
        System.out.println(Arrays.toString(reversed));





    }
}
