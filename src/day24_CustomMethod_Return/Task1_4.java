package day24_CustomMethod_Return;

import java.util.Arrays;

public class Task1_4 {
    public static void main(String[] args) {
    int[] arr={1,3,5,7,2,4,6,8};
    arr=reversedArray(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static int[] reversedArray(int[] arr){
        int[] reversedArr=new int[arr.length];
        for (int i = arr.length - 1,j=0; i >= 0; i--,j++) {
            reversedArr[i]=arr[j];
        }
        return reversedArr;
    }


}
