package day22_MultiDimentionalArrays;

import java.util.Arrays;

public class MultiDimentionalArraysIntro {
    public static void main(String[] args) {
        String [] group1={"Jon","Jack","Joes"};
        String [] group2={"Aaron","Shay","Breanna"};
        String [] group3={"Casandra","Tahir","Mike"};
        String [][] groups=new String[3][];
        groups[0]=group1;
        groups[1]=group2;
        groups[2]=group3;
        System.out.println(Arrays.toString(groups));
        System.out.println(Arrays.deepToString(groups));
        System.out.println("-------------------------------");

        int[][] arr2D={{1,2,3},{4,5,6,7,8},{8,9,10,11,12}};
        System.out.println(Arrays.deepToString(arr2D));
        System.out.println(Arrays.toString(arr2D[1]));
        System.out.println(arr2D[2][3]);
        for (int i=0;i<arr2D.length;i++){
            System.out.println(Arrays.toString(arr2D[i]));
        }


    }
}
