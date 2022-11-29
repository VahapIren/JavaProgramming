package day16_ForLoopStringPractice;

import java.util.Scanner;

public class FrequencyOfChar {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int count=0;
        System.out.println("Enter a String and a char");
        String str=scan.nextLine();
        String ch=scan.next();
        for (int i = 0; i < str.length(); i++) {
            if (ch.equalsIgnoreCase(""+str.charAt(i))){
                count++;
            }
        }
        System.out.println(count);
    }
}
