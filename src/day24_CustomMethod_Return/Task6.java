package day24_CustomMethod_Return;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[] array ={1,1,1,1,1,2,2};
        int[] newArr=addElement(array,1);
        System.out.println(Arrays.toString(newArr));
        newArr=add(newArr,1);
        System.out.println(Arrays.toString(newArr));

    }
    public static int[] addElement(int[] arr,int num){
        int[] array=new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            array[i]=arr[i];
        }
        array[array.length-1]=num;
        return array;
    }
    public static int[] add(int[] arr,int num){
        return ArraysUtility.addElement(arr,num);

    }

}
