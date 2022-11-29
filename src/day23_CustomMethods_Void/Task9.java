package day23_CustomMethods_Void;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your dollar");
        int dollar=scan.nextInt();
        dollarToEuro(dollar);

    }
    public static void dollarToEuro(int dollar){
        double euro=dollar*1.01;
        System.out.println("Your dollar is same to "+euro+" euro");
    }

}
