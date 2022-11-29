package day26_CustomMethodPractices;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveElement2 {
    public static void main(String[] args) {
        int[] array={100,200,300,400,500,600};
        System.out.println(Arrays.toString(removeElement(array,1)));

    }
    public static int[] removeElement(int[] array,int index){
        if (index<0||index>array.length-1){
            System.err.println("Invalid index number");
            System.exit(0);
        }

        int[] result={};
        for (int i = 0; i < array.length; i++) {
            if (i!=index){
                result=ArraysUtility.addElement(result,array[i]);
            }
        }
        return result;
    }

    public static double[] removeElement(double[] array,int index){
        if (index<0||index>array.length-1){
            System.err.println("Invalid index number");
            System.exit(0);
        }

        double[] result={};
        for (int i = 0; i < array.length; i++) {
            if (i!=index){
                result=ArraysUtility.addElement(result,array[i]);
            }
        }
        return result;
    }
}
