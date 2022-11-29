package day13_StringClass;

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first sentence");
        String first=scan.nextLine();
        System.out.println("enter second sentence");
        String second=scan.nextLine();
        if (first.length()>second.length()){
            System.out.println(first);
        }else{
            System.out.println(second);
        }
    }
}
