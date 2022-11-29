package day13_StringClass;

import java.util.Scanner;

public class ThreeWord {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a 3 letter word");
        String word=scan.next();
        if (word.length()==3){
            if (word.charAt(1)=='a'){
                System.out.println("Cool Word");
            }else{
                System.out.println("Okay Word");
            }
        } else if (word.length()>3) {
            System.out.println("Word is too long");
        }else {
            System.out.println("Word is too short");
        }
    }
}
