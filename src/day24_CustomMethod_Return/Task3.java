package day24_CustomMethod_Return;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the word");
        String word=scan.next();
        word=reverse(word);
        System.out.println(word);


    }
    public static String reverse(String word){
        String result="";
        for (int i = word.length()-1; i >=0 ; i--) {
            result+=word.charAt(i);
        }
return result;
    }
}
