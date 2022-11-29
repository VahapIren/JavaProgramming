package day12_Scanner;

import java.util.Scanner;

public class PlaceAnOrder {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the product name");
        String product= scan.nextLine();
        System.out.println("enter the price");
        double price=scan.nextDouble();
        System.out.println("enter the quantity");
        int quantity = scan.nextInt();
        System.out.println("enter your first name");
        String name=scan.next();
        System.out.println(name+", your order for "+quantity+" "+product+" has been places.Your total is "+(quantity*price));
    }
}
