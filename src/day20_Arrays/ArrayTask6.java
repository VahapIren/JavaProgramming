package day20_Arrays;

import java.util.Arrays;

public class ArrayTask6 {
    public static void main(String[] args) {

        int[] array = {0,12,0,13,0,10, 0, 5, 0, 1, 0};
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1; j++) {


                if (array[j] == 0 ) {
                    array[j] = array[j + 1];
                    array[j + 1] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(array));

    }
}
