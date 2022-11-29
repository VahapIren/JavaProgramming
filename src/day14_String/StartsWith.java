package day14_String;

import java.util.Scanner;

public class StartsWith {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a word");
        String word=scan.next();
        if (word.startsWith("x")){
            System.out.println(word.substring(1));
        }else{
            System.out.println(word);
        }
    }
}
