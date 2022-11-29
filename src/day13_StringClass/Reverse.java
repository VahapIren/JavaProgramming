package day13_StringClass;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String result="";
        System.out.println("Enter a word");
        String word=scan.next();
        if (word.length()==5){
            result=word;
        } else if (word.length()>5) {
            result="Too long";
        }else {
            result="Too short";
        }
        System.out.println(result);
    }
}
