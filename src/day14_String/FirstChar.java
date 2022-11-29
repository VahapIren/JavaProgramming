package day14_String;

import java.util.Scanner;

public class FirstChar {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a word");
        String word=scan.next();

        if (word.charAt(0)>='0'&&word.charAt(0)<='9'){
            System.out.println("first character is digit");
        } else if (word.charAt(0)>='a'&&word.charAt(0)<='z') {
            System.out.println("first character is lower case");
        } else if (word.charAt(0)>='A'&&word.charAt(0)<='Z') {
            System.out.println("first character is upper case");
        }else{
            System.out.println("first character is special character");
        }
    }
}
