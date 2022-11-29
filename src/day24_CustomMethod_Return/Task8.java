package day24_CustomMethod_Return;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        System.out.println(Arrays.toString(reverse(arr)));

    }
    public static int[] reverse(int[] array){
        int[] reverse=new int[array.length];
        for (int i = 0,j=array.length-1; i < array.length; i++,j--) {
            reverse[i]=array[j];
        }
        return reverse;
    }
}
