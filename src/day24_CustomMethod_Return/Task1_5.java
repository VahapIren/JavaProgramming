package day24_CustomMethod_Return;

import java.util.Arrays;

public class Task1_5 {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={6,7,8,90,0};
        System.out.println(Arrays.toString(merge(arr1,arr2)));

    }
    public static int[] merge(int[] arr1,int[] arr2){
        int[] newArr=new int[arr1.length+arr2.length];
        int i=0;

        for (int each:arr1) {
            newArr[i]=each;
            i++;
        }
        for (int each: arr2){
            newArr[i]=each;
            i++;
        }
        return newArr;
    }
}
