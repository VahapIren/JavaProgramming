package day24_CustomMethod_Return;

import utilities.ArraysUtility;
import utilities.StringUtility;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the word");
        String word=scan.next();
        boolean palindrom=isPalindrom(word);
        System.out.println(palindrom);
        System.out.println("StringUtility.isPalindrom(word) = " + StringUtility.isPalindrom(word));
        System.out.println("StringUtility.anagram(word,word) = " + StringUtility.anagram(word, word));
    }
    public static String reverse(String word){
        String result="";
        for (int i = word.length()-1; i >=0 ; i--) {
            result+=word.charAt(i);
        }
        return result;
    }
    public static boolean isPalindrom(String word){
        boolean result=false;
        if (word.equalsIgnoreCase(reverse(word))){
         result=true;
        }
        return result;
    }

}
