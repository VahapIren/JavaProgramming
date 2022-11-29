package day23_CustomMethods_Void;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your dollar");
        int dollar=scan.nextInt();
        dollarToLira(dollar);
    }
    public static void dollarToLira(int dollar){
        double lira=dollar*18.650;
        System.out.println("Your dollar is same to "+lira+" lira");
    }

}
