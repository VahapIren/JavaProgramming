package day16_ForLoopStringPractice;

public class Palindrom {
    public static void main(String[] args) {
        String word="racecar";
        String reverse="";
        for (int i = word.length()-1; i >=0 ; i--) {
            reverse+=word.charAt(i);
        }
        boolean isPalindrom=word.equalsIgnoreCase(reverse);
        System.out.println(isPalindrom);

    }
}
