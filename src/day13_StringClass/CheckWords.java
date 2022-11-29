package day13_StringClass;

import java.util.Scanner;

public class CheckWords {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 1. word");
        String first= scan.next();
        System.out.println("Enter 2. word");
        String second= scan.next();
        System.out.println("Enter 3. word");
        String third= scan.next();
        if (first.length()==second.length()&&second.length()==third.length()){
            System.out.println("All words are same length");
        } else if (first.length()==second.length()||second.length()==third.length()||first.length()==third.length()) {
            System.out.println("Not Same nor Different lengths");
        }else {
            System.out.println("All different length");
        }

    }
}
