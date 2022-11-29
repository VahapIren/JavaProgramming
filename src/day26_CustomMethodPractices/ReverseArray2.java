package day26_CustomMethodPractices;

import utilities.ArraysUtility;

import java.util.Arrays;

public class ReverseArray2 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int[] reverse=reverse(arr);
        System.out.println(Arrays.toString(reverse));

    }


    public static int[] reverse(int[] array){
        int[] result={};
        for (int i = array.length - 1; i >= 0; i--) {
            result= ArraysUtility.addElement(result,array[i]);
        }
        return result;
    }
}
