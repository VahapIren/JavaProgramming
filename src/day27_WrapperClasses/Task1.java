package day27_WrapperClasses;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

      int[] arr = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(insert(arr, 2, 100)));


    }
    public static int[] insert(int [] arr,int index,int element){
        int[] newArrray=new int[arr.length+1];
        int i=0;
        for (int j = 0; j < newArrray.length; j++) {
            if (j==index) {
                newArrray[j]=element;
                continue;
            }
            newArrray[j]=arr[i++];
        }
        return newArrray;
    }

    public static double[] insert(double [] arr,int index,double element){
        double[] newArrray=new double[arr.length+1];
        int i=0;
        for (int j = 0; j < newArrray.length; j++) {
            if (j==index) {
                newArrray[j]=element;
                continue;
            }
            newArrray[j]=arr[i++];
        }
        return newArrray;
    }
}
