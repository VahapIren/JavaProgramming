package officeHours;

import java.util.Arrays;

public class MultiDimentionalArrays {
    public static void main(String[] args) {

        int[] numbers=new int[5];
        int[][] numbers2D=new int[5][];
        int[][][] numbers3D=new int[5][][];
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.deepToString(numbers2D));

        numbers[0]=5;
        numbers2D[0]=new int[]{1,2,3};
        System.out.println(Arrays.deepToString(numbers2D));

        int[] element1={1,2,3,4};
        numbers2D[1]=element1;
        System.out.println(Arrays.deepToString(numbers2D));

        System.out.println(numbers2D[1][1]);
    }
}
