package day27_WrapperClasses;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

        int[] array={10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(swap(array,2,4)));

    }

    public static int[] swap(int[] array, int i, int j){
        int d= array[i];
        array[i]= array[j];
        array[j]=d;

        return array;
    }

    public static double[] swap(double[] array, int i, int j){
        double d= array[i];
        array[i]= array[j];
        array[j]=d;

        return array;
    }
}
