package day13_StringClass;

import java.util.Scanner;

public class Choice {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a String");
        String str=scan.nextLine();
        if (str.isEmpty()){
            System.out.println("string is empty");
        } else if (str.length()>3) {
            System.out.println(str.substring(str.length()-3));
        }else {
            System.out.println(str);
        }
    }
}
