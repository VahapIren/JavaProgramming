package day24_CustomMethod_Return;

import java.util.Scanner;

public class First2Char {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println(print2Char(scan.next()));

    }
    public static String print2Char(String str){
        return str.substring(0,2).toUpperCase();

    }

}
