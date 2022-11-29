package day24_CustomMethod_Return;

import java.util.Scanner;

public class NonEmptyString {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println(nonEmpty(in.next()));

    }

    private static String nonEmpty(String next) {
        String result="";
        for (int i = 0; i <= next.length()-1; i++) {
            result+=next.substring(0,i+1);
        }
        return result;
    }


}
