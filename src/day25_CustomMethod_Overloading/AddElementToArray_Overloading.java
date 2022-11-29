package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddElementToArray_Overloading {
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5,6};
        numbers=addElement(numbers,7);
        char[] chars={'A','B','C','D'};
        chars=addElement(chars,'E');

        String[] names={"Ahmet","Nadir","Muhtar","Asiya"};
        names=addElement(names,"Adam");
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(chars));
        System.out.println(Arrays.toString(names));
    }
    public static int[] addElement(int[] array,int element){
        int newArray[]=new int[array.length+1];
        int i=0;
        for (int each:array){
            newArray[i++]=each;
        }
        newArray[i]=element;
        return newArray;
    }

    public static double[] addElement(double[]  array,double element){
        double[] newArray=new double[array.length+1];
        int i=0;
        for (double each:array){
            newArray[i++]=each;
        }
        newArray[i]=element;
        return newArray;
    }
    public static String[] addElement(String[]  array,String element){
        String[] newArray=new String[array.length+1];
        int i=0;
        for (String each:array){
            newArray[i++]=each;
        }
        newArray[i]=element;
        return newArray;
    }

    public static char[] addElement(char[]  array,char element){
        char[] newArray=new char[array.length+1];
        int i=0;
        for (char each:array){
            newArray[i++]=each;
        }
        newArray[i]=element;
        return newArray;
    }




}


