package day23_CustomMethods_Void;

import java.util.Arrays;

public class Task14 {
    public static void main(String[] args) {
        int[] numbers={12,34,23,45,67,43,67,322,89};
        Arrays.sort(numbers);
        printEachElement(numbers);
    }
    public static void printEachElement(int[] num){
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}
