package day24_CustomMethod_Return;

import java.util.Scanner;

public class DonateBlood {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=scan.nextInt();
        System.out.println("Enter your weight");
        int weight=scan.nextInt();
        isEligibleDonateBlood(age,weight);

    }

    public static void isEligibleDonateBlood(int age, int weight) {
        if (age>=18){
            if (weight>=50)
                System.out.println("You are eligible to donate blood");
            else
                System.out.println("You are not eligible to donate blood");
        }else
            System.out.println("Age must be greater than 18");

    }
}
