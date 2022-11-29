package day22_MultiDimentionalArrays;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int [][] array={ {1,2,3}, {4,5,6}};
        int [][] reverse=new int[2][3];
        for (int i = array.length-1,k=0; i >=0 ; i--,k++) {
            for (int j = array[i].length-1,l=0; j >=0 ; j--,l++) {
                reverse[k][l]=array[i][j];
            }
        }
        System.out.println(Arrays.deepToString(reverse));
    }
}
