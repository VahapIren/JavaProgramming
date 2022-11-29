package utilities;

import java.util.Arrays;

public class StringUtility {

    //print each character of given String
    public static void printEachCharacter(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }

    //reverse the String
    public static String reverse(String str){
        String result="";
        for (int i = str.length()-1; i >=0 ; i--) {
            result+=str.charAt(i);
        }
        return result;
    }

    //checks if String is palindrom  true/false

    public static boolean isPalindrom(String str){
        return reverse(str).equalsIgnoreCase(str);
    }

    //check if the String is anagram
    public static boolean anagram(String str1,String str2){
        char[] ch1= str1.toCharArray();
        char[] ch2= str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);
    }

    //given the duplicates from given String, returns String
    public static String removeDuplicates(String str){
        String result="";
        for (int i = 0; i < str.length(); i++) {
            char each=str.charAt(i);
            if (!result.contains(""+each))
                result+=each;

        }
        return result;
    }


}
