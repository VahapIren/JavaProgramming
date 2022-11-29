package day13_StringClass;

import java.util.Scanner;

public class SameChar {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence=scan.nextLine();
        char first=sentence.charAt(0);
        char last=sentence.charAt(sentence.length()-1);
        if (first==last){
            System.out.println("Same");
        }
    }
}
