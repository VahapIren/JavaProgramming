package day13_StringClass;

import java.util.Scanner;

public class FirstAndLastChar {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence=scan.nextLine();
        char first=sentence.charAt(0);
        char last=sentence.charAt(sentence.length()-1);
        System.out.println("first = " + first);
        System.out.println("last = " + last);
    }
}
