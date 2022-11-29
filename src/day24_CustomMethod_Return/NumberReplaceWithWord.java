package day24_CustomMethod_Return;

import java.util.Scanner;

public class NumberReplaceWithWord {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println(numberInsteadOfWord(scan.nextInt()));

    }
    public static String numberInsteadOfWord(int number){
        String result="";
        if (number%2==0)
            result+="Codility";
        if (number%3==0)
            result+="Test";
        if (number%5==0)
            result+="Coders";
        return result;
    }
}
