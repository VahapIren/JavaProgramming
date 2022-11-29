package day23_CustomMethods_Void;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter String");
        String str=scan.next();
        printEachChar(str);

    }
    public static void printEachChar(String str){
        char[] ch=str.toCharArray();
        for (char each:ch){
            System.out.println(each);
        }
    }
}
