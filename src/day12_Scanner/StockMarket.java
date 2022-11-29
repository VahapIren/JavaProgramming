package day12_Scanner;

import java.util.Scanner;

public class StockMarket {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("how many total shares they have already?");
        int share=scan.nextInt();
        if (share>0){
            System.out.println("how much their total value in the stock market is");
            double value= scan.nextDouble();
            System.out.println("enter the name of the company they have the most shares in");
            scan.nextLine();
            String companyName=scan.nextLine();
            System.out.println("Your total stock market holding is $"+value+" which is made up of "+share+" shares."+companyName+" is your company holdings");

        }
    }
}
