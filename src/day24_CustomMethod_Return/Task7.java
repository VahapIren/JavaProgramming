package day24_CustomMethod_Return;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6,7,8,9};
        System.out.println(Arrays.toString(merge(arr1,arr2)));

    }
    public static int[] merge(int[] arr1,int[]arr2){
        int[] array=new int[arr1.length+arr2.length];
        int i=0;
        for (int each:arr1){
            array[i]=each;
            i++;
        }
        for (int each:arr2){
            array[i]=each;
            i++;
        }
        return array;

    }


}
