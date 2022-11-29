package day26_CustomMethodPractices;


import utilities.ArraysUtility;

import java.util.Arrays;

public class Merge2Arrays2 {
    public static void main(String[] args) {

        int[] arr1={1,2,3,4};
        int[] arr2={5,6,7};
        int[] arr3=merge(arr1,arr2);
        System.out.println(Arrays.toString(arr3));
        System.out.println("------------------------");

        String [] a1={"A","B","C"};
        String [] a2={"D","E","F"};
        String [] a3=ArraysUtility.merge(a1,a2);
        System.out.println(Arrays.toString(a3));
    }

    public static int[] merge(int[] arr1,int[] arr2){
        int[] result={};
        for (int each : arr1) {
           result= ArraysUtility.addElement(result,each);
        }
        for (int each : arr2) {
            result= ArraysUtility.addElement(result,each);
        }
        return result;
    }
}
