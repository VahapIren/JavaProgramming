package day24_CustomMethod_Return;

import java.util.Scanner;

public class HowManyTimesRepeat {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        String word=scan.next();

        System.out.println(howManyTimes(str, word));
    }

    public static int howManyTimes(String str, String word) {
        int count=0;
           while (true) {
               if (str.contains(word)) {

                   str = str.replaceFirst(word, "");
                   count++;
               } else
                   break;


           }
           return count;
    }

}
