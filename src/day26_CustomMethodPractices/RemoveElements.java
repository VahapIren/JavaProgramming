package day26_CustomMethodPractices;

import java.util.Arrays;

public class RemoveElements {
    public static void main(String[] args) {

       int[] array={100,200,300,400,500,600};
        System.out.println(Arrays.toString(removeElements(array,1)));

    }
    //remove the index from array, returns new array
    public static int[] removeElements(int[] array, int index){

        if (index<0||index>array.length-1){
            System.err.println("Invalid index number");
            System.exit(0);
        }
        int[] result=new int[array.length-1];
        int j=0;
        for (int i=0;i<array.length;i++) {
            if (i==index){
                continue;
            }
            result[j]=array[i];
            j++;
        }
        return result;
    }

    public static double[] removeElements(double[] array, int index){

        if (index<0||index>array.length-1){
            System.err.println("Incalid index number");
            System.exit(0);
        }
        double[] result=new double[array.length-1];
        int j=0;
        for (int i=0;i<array.length;i++) {
            if (i==index){
                continue;
            }
            result[j]=array[i];
            j++;
        }
        return result;
    }

    public static char[] removeElements(char[] array, int index){

        if (index<0||index>array.length-1){
            System.err.println("Incalid index number");
            System.exit(0);
        }
        char[] result=new char[array.length-1];
        int j=0;
        for (int i=0;i<array.length;i++) {
            if (i==index){
                continue;
            }
            result[j]=array[i];
            j++;
        }
        return result;
    }

    public static String[] removeElements(String[] array, int index){

        if (index<0||index>array.length-1){
            System.err.println("Incalid index number");
            System.exit(0);
        }
        String[] result=new String[array.length-1];
        int j=0;
        for (int i=0;i<array.length;i++) {
            if (i==index){
                continue;
            }
            result[j]=array[i];
            j++;
        }
        return result;
    }



}
