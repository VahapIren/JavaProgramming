package day14_String;

import java.util.Scanner;

public class TwoWord {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter two words");
        String word1=scan.next();
        String word2=scan.next();

        System.out.println(word1.substring(1)+word2.substring(1));
    }
}
