package day26_CustomMethodPractices;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElement {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int[] unique=uniqueElement(arr);
        System.out.println(Arrays.toString(unique));

        double[] arr1={1.5,2.5,2.5,3.5,3.5,4.5};
        double[] unique2=uniqueElement(arr1);
        System.out.println(Arrays.toString(unique2));

    }
    //returns the unique elements of the array as a new array
    public static int[] uniqueElement(int[] array){
        int[] result={};
        for (int each : array) {
            if (ArraysUtility.frequencyOfElement(array,each)==1){
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    public static double[] uniqueElement(double[] array){
        double[] result={};
        for (double each : array) {
            if (ArraysUtility.frequencyOfElement(array,each)==1){
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    public static char[] uniqueElement(char[] array){
        char[] result={};
        for (char each : array) {
            if (ArraysUtility.frequencyOfElement(array,each)==1){
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    public static String[] uniqueElement(String[] array){
        String[] result={};
        for (String each : array) {
            if (ArraysUtility.frequencyOfElement(array,each)==1){
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }
}
