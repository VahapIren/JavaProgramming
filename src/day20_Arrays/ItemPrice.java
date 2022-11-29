package day20_Arrays;

import java.util.Scanner;

public class ItemPrice {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sum=0;
        String items[]=new String[5];
        int[] prices=new int[5];
        for (int i = 0; i < items.length; i++) {
            System.out.println("Enter "+(i+1)+". item name");
            items[i]=scan.next();
            System.out.println("Enter "+(i+1)+". item price");
            prices[i]=scan.nextInt();
            sum+=prices[i];
        }
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]+"------>"+prices[i]);
        }
        System.out.println("Total Price:"+sum);



    }
}
