package day23_CustomMethods_Void;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter kg");
        int kg=scan.nextInt();
        kgToLbs(kg);


    }
    public static void kgToLbs(int kg){
        double lbs=kg*2.2046;
        System.out.println(kg+" kg is same to "+lbs+"lbs.");
    }

}
