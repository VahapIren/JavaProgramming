package day14_String;

import java.util.Scanner;

public class TwoWord2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter two word");
        String word=scan.next();
        String word2=scan.next();
        if (word.charAt(word.length()-1)==word2.charAt(0)){
            System.out.println(word+word2.substring(1));
        }
    }
}
