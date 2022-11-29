package day24_CustomMethod_Return;

import java.util.Scanner;

public class Encrypt {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println(encryptWord(scan.next()));

    }

    public static String  encryptWord(String next) {
        String result="";
        for (int i = 0; i < next.length(); i++) {
            if (i<next.length()-1)
              result+=next.charAt(i)+"x";
            else
                result+=next.charAt(i);
        }
        return result;

    }


}
