package day22_MultiDimentionalArrays;

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {

        String sentence="Today is good day to learn Java";
        String[] words=sentence.split(" ");
        System.out.println(Arrays.toString(words));
        String reversedSenrence="";
        for (int i = words.length-1; i >=0 ; i--) {
            reversedSenrence+=words[i]+" ";


        }
        System.out.println(reversedSenrence);
        for (int i = words.length-1; i >=0 ; i--) {
            System.out.print(words[i]+", ");
        }


    }
}
