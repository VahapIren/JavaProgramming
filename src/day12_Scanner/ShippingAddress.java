package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your full name");
        String fullName= scan.nextLine();
        System.out.println("Enter your building number");
        String building= scan.next();

        scan.nextLine();

        System.out.println("Enter your street name");
        String streeet=scan.nextLine();
        // no need scan.nextLine();
        System.out.println("Enter your city name");
        String city= scan.nextLine();

        System.out.println("Enter your state:");
        String state= scan.next();

        System.out.println("Enter your zipcode");
        String zipCode= scan.next();

        scan.nextLine();

        System.out.println("Enter your country name:");
        String country=scan.nextLine();
        scan.close();
/*
v i

 */


    }
}
