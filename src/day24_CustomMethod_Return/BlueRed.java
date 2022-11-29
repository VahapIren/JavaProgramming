package day24_CustomMethod_Return;

import java.util.Scanner;

public class BlueRed {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println(blueRed(scan.next()));

    }

    public static String  blueRed(String next) {
        String result = "";
        if (next.startsWith("blue") || next.startsWith("red")) {
            if (next.startsWith("blue"))
                result = "blue";
            else
                result = "red";
        }
        return result;
    }
}
