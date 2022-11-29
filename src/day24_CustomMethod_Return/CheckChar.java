package day24_CustomMethod_Return;

import java.util.Scanner;

public class CheckChar {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        checkChar(scan.next().charAt(0));

    }
    public static void checkChar(char ch){
        if (Character.isUpperCase(ch))//ch>=65&&ch<=90
            System.out.println(ch+" is an Uppercase character");
        else if (ch>=97&&ch<=122) {
            System.out.println(ch+" is a Lowercase character");
        }else
            System.out.println(ch+" is not an alphabethic character");
    }
}
