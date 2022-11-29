package day15_ForLoop;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String result ="";
        System.out.println("enter a word");
        String word=scan.next();
        for (int i=word.length()-1;i>=0;i--){
            result +=word.charAt(i);
        }
        if (word.equalsIgnoreCase(result)){
            System.out.println("Palindrom");
        }
    }
}
