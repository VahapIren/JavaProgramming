package day24_CustomMethod_Return;

import java.util.Scanner;

public class ThreeCopies {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        last2Copies(in.next());
    }

    public static void last2Copies(String next) {
        if (next.length()>=2)
        System.out.println(next.substring(next.length()-2));
        else
            System.out.println("The string length must be at least 2");

        System.out.println(next.substring(1,next.length()-1));
    }


}
