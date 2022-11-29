package day25_CustomMethod_Overloading;

import utilities.ArraysUtility;

public class Test2 {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,67,89,0};
        ArraysUtility.printEach(arr1);
        System.out.println("-------------------");
        int[] n1={1,4,6,7,8,33,21,41,11};
        int max1=ArraysUtility.max(n1);
        int min1=ArraysUtility.min(n1);
        System.out.println("max1 = " + max1);
        System.out.println("min1 = " + min1);
        System.out.println("---------------------");
        double[] n2={2.3,4.5,6.7,5.4,12.4,56.7};
        double max2=ArraysUtility.max(n2);
        double min2=ArraysUtility.min(n2);
        System.out.println("max2 = " + max2);
        System.out.println("min2 = " + min2);
        System.out.println("*--------------------------");

        int[] a1={1,2,3,4,5,6,67};
        boolean r1=ArraysUtility.contains(a1,6);
        System.out.println("r1 = " + r1);
    }
}
