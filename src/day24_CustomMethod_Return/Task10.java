package day24_CustomMethod_Return;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60};
        int index = 5;
        int[] arr=removeElement(array,index);
        System.out.println(Arrays.toString(arr));

    }
    public static int[] removeElement(int[] array,int index){
        int[] arr=new int[array.length-1];
        for (int i = 0,j=0; i <arr.length; i++) {


            if (i==index) {
                arr[i]=array[j+1];
                j+=2;

                continue;
            }
            arr[i]=array[j];

            j++;

        }
        return arr;


    }
}
