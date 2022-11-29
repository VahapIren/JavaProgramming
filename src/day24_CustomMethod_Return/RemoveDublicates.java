package day24_CustomMethod_Return;
import java.util.Scanner;
public class RemoveDublicates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(uniqueChars(in.next()));


    }

    public static String uniqueChars(String str) {
        String result = "";


            for (int i = 0; i < str.length(); i++) {

                if (result.contains(str.charAt(i)+"")) {
                    continue;
                }else
                    result+=str.charAt(i);
            }





        return result;
    }
}