package day24_CustomMethod_Return;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        String str1="aevcfg";
        String str2="gfcavn";
        boolean anagram=isAnagram(str1,str2);
        System.out.println(anagram);

    }
    public static boolean isAnagram(String str1,String str2){
        char [] ch1= str1.toCharArray();
        char [] ch2= str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean anagram=Arrays.equals(ch1,ch2);
        return anagram;

    }
}
