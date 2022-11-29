package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDublicates {
    public static void main(String[] args) {
        int[] arr={1,11,11,11,1,2,3,4,54,3,2,3,4,5};
        arr=removeDublivates(arr);
        System.out.println(Arrays.toString(arr));


    }
    public static int[] removeDublivates(int[] array){
        int[]result={};
        for (int each : array) {
            if (!ArraysUtility.contains(result,each)){
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;

    }

    public static double[] removeDublivates(double[] array){
        double[]result={};
        for (double each : array) {
            if (!ArraysUtility.contains(result,each)){
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;

    }

    public static String[] removeDublivates(String[] array){
        String[]result={};
        for (String each : array) {
            if (!ArraysUtility.contains(result,each)){
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;

    }

    public static char[] removeDublivates(char[] array){
        char[]result={};
        for (char each : array) {
            if (!ArraysUtility.contains(result,each)){
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;

    }

}
