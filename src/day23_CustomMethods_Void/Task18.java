package day23_CustomMethods_Void;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter String1");
        String str1=scan.next();
        System.out.println("Enter String2");
        String str2=scan.next();
        palindrom(str1,str2);

    }
    public static void palindrom(String str1,String str2){
        String res="";
        for (int i = str2.length()-1; i >=0 ; i--) {
            res+=str2.charAt(i);
        }
        if (str1.equals(res)){
            System.out.println(str1+" and "+str2+" are palindrom");
        }
    }

}
