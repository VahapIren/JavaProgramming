package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddElementsToArray {
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5};
        arr=addInteger(arr,6);
        System.out.println(Arrays.toString(arr));

        double[] arr2={1.5,2.5,3.5,4.5};
        arr2=addDouble(arr2,5.5);
        System.out.println(Arrays.toString(arr2));

        String[] names={"Tatiana","Alexandra","Casandra","Ali"};
        names=addString(names,"Igor");
        System.out.println(Arrays.toString(names));

        char[] chars={'A','B','C','D'};
        chars=addChar(chars,'E');
        System.out.println(Arrays.toString(chars));

    }
    public static int[] addInteger(int[] array,int element){
        int newArray[]=new int[array.length+1];
        int i=0;
        for (int each:array){
            newArray[i++]=each;
        }
        newArray[i]=element;
        return newArray;
    }

    public static double[] addDouble(double[]  array,double element){
        double[] newArray=new double[array.length+1];
        int i=0;
        for (double each:array){
            newArray[i++]=each;
        }
        newArray[i]=element;
        return newArray;
    }
    public static String[] addString(String[]  array,String element){
        String[] newArray=new String[array.length+1];
        int i=0;
        for (String each:array){
            newArray[i++]=each;
        }
        newArray[i]=element;
        return newArray;
    }

    public static char[] addChar(char[]  array,char element){
        char[] newArray=new char[array.length+1];
        int i=0;
        for (char each:array){
            newArray[i++]=each;
        }
        newArray[i]=element;
        return newArray;
    }



}
