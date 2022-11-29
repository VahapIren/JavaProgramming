package day21_ForEachLoop;

import java.util.Arrays;

public class PracticeTask1 {
    public static void main(String[] args) {
        int[] arr={1,3,2,5,4,7,6,8,9,56,43,};
        Arrays.sort(arr);
        int[] decend=new int[arr.length];
        for (int i = 0,j=decend.length-1; i <decend.length ; i++,j--) {
            decend[j]=arr[i];
        }
        System.out.println(Arrays.toString(decend));

    }
}
