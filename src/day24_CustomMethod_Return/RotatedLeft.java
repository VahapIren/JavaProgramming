package day24_CustomMethod_Return;

import java.util.Arrays;

public class RotatedLeft {
    public static void main(String[] args) {

        int[] y = {1,2,3,4};
        int x=y[0];
        for (int i = 0; i < y.length-1; i++) {

            y[i]=y[i+1];

        }
        y[y.length-1]=x;
        System.out.println(Arrays.toString(y));

    }
}
