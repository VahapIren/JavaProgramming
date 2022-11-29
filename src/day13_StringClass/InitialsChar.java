package day13_StringClass;

import java.util.Scanner;

public class InitialsChar {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a string");
        String input1=scan.next();
        String input2=scan.next();
        System.out.println(input1.toUpperCase().charAt(0)+"."+input2.toUpperCase().charAt(0));


    }


}
