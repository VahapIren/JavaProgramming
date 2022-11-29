package day18_NestedLoop;

import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence=scan.nextLine();
        char first=sentence.charAt(0);
        char second=sentence.charAt(sentence.length()-1);
        System.out.println(first+" "+second);


    }
}
