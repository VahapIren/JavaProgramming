package utilities;

import java.util.Arrays;

public class ArraysUtility {
    //print each integer of an integer array in seperate lines
    public static void printEach(int[] array){
        for (int each:array){
            System.out.println(each);
        }
    }

    //print each double of an double array in seperate lines
    public static void printEach(double[] array){
        for (double each:array){
            System.out.println(each);
        }
    }

    //print each char of an char array in seperate lines
    public static void printEach(char[] array){
        for (char each:array){
            System.out.println(each);
        }
    }

    //print each String of an String array in seperate lines
    public static void printEach(String[] array){
        for (String each:array){
            System.out.println(each);
        }
    }

    //returns the max number of integer array
    public static int max(int[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }

    //returns the max number of double array
    public static double max(double[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }

    //returns the min number of integer array
    public static int min(int[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }

    //returns the min number of double array
    public static double min(double[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }

    //checks if the given integer is contained in the given array. return boolean. contains(int[], int)
    public static boolean contains(int[] array, int element){
        boolean result=false;
        for (int each:array){
            if (each==element){
                result=true;
            }
        }
        return result;
    }

    //checks if the given double is contained in the given array. return boolean. contains(double[], double)
    public static boolean contains(double[] array, double element){
        boolean result=false;
        for (double each:array){
            if (each==element){
                result=true;
            }
        }
        return result;
    }

    //checks if the given char is contained in the given array. return boolean. contains(char[], char)
    public static boolean contains(char[] array, char element){
        boolean result=false;
        for (char each:array){
            if (each==element){
                result=true;
            }
        }
        return result;
    }

    //checks if the given String is contained in the given array. return boolean. contains(String[], String)
    public static boolean contains(String[] array, String element){
        boolean result=false;
        for (String each:array){
            if (each.equals(element)){
                result=true;
            }
        }
        return result;
    }

    //add the given integer element to array, returns a new array
    public static int[] addElement(int[] array,int element){
        int newArray[]=new int[array.length+1];
        int i=0;
        for (int each:array){
            newArray[i++]=each;
        }
        newArray[i]=element;
        return newArray;
    }

    //add the given double element to array, returns a new array
    public static double[] addElement(double[]  array,double element){
        double[] newArray=new double[array.length+1];
        int i=0;
        for (double each:array){
            newArray[i++]=each;
        }
        newArray[i]=element;
        return newArray;
    }

    //add the given String element to array, returns a new array
    public static String[] addElement(String[]  array,String element){
        String[] newArray=new String[array.length+1];
        int i=0;
        for (String each:array){
            newArray[i++]=each;
        }
        newArray[i]=element;
        return newArray;
    }

    //add the given char element to array, returns a new array
    public static char[] addElement(char[]  array,char element){
        char[] newArray=new char[array.length+1];
        int i=0;
        for (char each:array){
            newArray[i++]=each;
        }
        newArray[i]=element;
        return newArray;
    }

    //returns the frequency of given element from given array
    public static int frequencyOfElement(int[] array, int element){
        int count=0;
        for (int each : array) {
            if (each==element){
                count++;
            }
        }
        return count;
    }

    public static int frequencyOfElement(double[] array, double element){
        int count=0;
        for (double each : array) {
            if (each==element){
                count++;
            }
        }
        return count;
    }

    public static int frequencyOfElement(char[] array, char element){
        int count=0;
        for (char each : array) {
            if (each==element){
                count++;
            }
        }
        return count;
    }

    public static int frequencyOfElement(String [] array, String element){
        int count=0;
        for (String each : array) {
            if (each.equals(element)){
                count++;
            }
        }
        return count;
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

    //remove the index from array, returns new array
    public static int[] removeElements(int[] array, int index){

        if (index<0||index>array.length-1){
            System.err.println("Incalid index number");
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

    //merge the given two arrays and return the new array
    public static int[] merge(int[]arr1,int[]arr2){
        int[] result= {};
        for (int each:arr1) {
            result=addElement(result,each);
        }
        for (int each : arr2) {
            result=addElement(result,each);
        }
        return result;
    }

    public static double[] merge(double[]arr1,double[]arr2){
        double[] result= {};
        for (double each:arr1) {
            result=addElement(result,each);
        }
        for (double each : arr2) {
            result=addElement(result,each);
        }
        return result;
    }

    public static char[] merge(char[]arr1,char[]arr2){
        char[] result= {};
        for (char each:arr1) {
            result=addElement(result,each);
        }
        for (char each : arr2) {
            result=addElement(result,each);
        }
        return result;
    }
    public static String[] merge(String[]arr1,String[]arr2){
        String[] result= {};
        for (String each:arr1) {
            result=addElement(result,each);
        }
        for (String each : arr2) {
            result=addElement(result,each);
        }
        return result;
    }

    //reverse the given array, returns a array
    public static int[] reverse(int[] array){
        int[] result=new int[array.length];
        for (int i = array.length - 1,j=0; i >= 0; i--,j++) {
            result[j]=array[i];
        }
        return result;
    }

    public static double[] reverse(double[] array){
        double[] result=new double[array.length];
        for (int i = array.length - 1,j=0; i >= 0; i--,j++) {
            result[j]=array[i];
        }
        return result;
    }

    public static char[] reverse(char[] array){
        char[] result=new char[array.length];
        for (int i = array.length - 1,j=0; i >= 0; i--,j++) {
            result[j]=array[i];
        }
        return result;
    }

    public static String[] reverse(String[] array){
        String[] result=new String[array.length];
        for (int i = array.length - 1,j=0; i >= 0; i--,j++) {
            result[j]=array[i];
        }
        return result;
    }

    //replace the element of array at given index with the new element
    public static int[] replace(int[] array,int index,int newElement){
        if (index<0||index>array.length-1) {
            System.out.println("Invalid Index");
            System.exit(0);
        }
        array[index]=newElement;
        return array;
    }

    public static double[] replace(double[] array,int index,double newElement){
        if (index<0||index>array.length-1) {
            System.out.println("Invalid Index");
            System.exit(0);
        }
        array[index]=newElement;
        return array;
    }

    public static char[] replace(char[] array,int index,char newElement){
        if (index<0||index>array.length-1) {
            System.out.println("Invalid Index");
            System.exit(0);
        }
        array[index]=newElement;
        return array;
    }

    public static String[] replace(String[] array,int index,String newElement){
        if (index<0||index>array.length-1) {
            System.out.println("Invalid Index");
            System.exit(0);
        }
        array[index]=newElement;
        return array;
    }

    //replaces all the matching values of array with the new value
    public static int[] replaceAll(int[] array, int oldValue, int newValue){

        for (int i = 0; i < array.length; i++) {
            if (array[i]== oldValue){
                array[i]= newValue;
            }
        }
        return array;
    }

    public static double[] replaceAll(double[] array, double oldValue, double newValue){

        for (int i = 0; i < array.length; i++) {
            if (array[i]== oldValue){
                array[i]= newValue;
            }
        }
        return array;
    }

    public static char[] replaceAll(char[] array, char oldValue, char newValue){

        for (int i = 0; i < array.length; i++) {
            if (array[i]== oldValue){
                array[i]= newValue;
            }
        }
        return array;
    }

    public static String[] replaceAll(String[] array, String oldValue, String newValue){

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(oldValue)){
                array[i]= newValue;
            }
        }
        return array;
    }


    //removes dublicates from given array, returns new array
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
