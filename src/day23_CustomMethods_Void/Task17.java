package day23_CustomMethods_Void;

import java.util.Arrays;
import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter String1");
        String str1=scan.next();
        System.out.println("Enter String2");
        String str2=scan.next();
        anagram(str1,str2);
    }
    public static void anagram(String str1,String str2){
        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));
        if (Arrays.equals(ch1,ch2)){
            System.out.println(str1+" and "+str2+" are anagram");
        }else{
            System.out.println(str1+" and "+str2+" are not anagram");
        }

    }

}
