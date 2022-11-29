package day22_MultiDimentionalArrays;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {

        int[][] arr2D={{1,2,3},{4,5,6,7},{8,9,10,11,12}};

        for (int[] each:arr2D){
            System.out.println(Arrays.toString(each));
        }
        for (int[] each:arr2D){
            for (int eacgElement:each) {
                System.out.print(eacgElement+" ");

            }
            System.out.println(Arrays.toString(each));
        }


    }
}
