package day31_Constructors;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {

        String array[][]=new String[3][3];
        array[0][0]="a";
        array[1][0]="b";
        array[2][0]="c";

        System.out.println(Arrays.deepToString(array));

    }
}
