package day11_Switch_Scanner;

import java.util.Scanner;

public class CappucınoBuyyer {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double price=0;
        int calories=0;
        String result="";
        System.out.println("Enter size:");
        int size= scan.nextInt();
        boolean validSize=(size>=1||size<=3);
        if (validSize) {
            switch (size) {

                case 1:
                    price = 3.69;
                    calories = 90;
                    result=("tall\nprice is "+price+"\n"+calories+" calories");
                    break;
                case 2:
                    price = 3.99;
                    calories = 120;
                    result=("grande\nprice is "+price+"\n"+calories+" calories");
                    break;
                case 3:
                    price = 4.29;
                    calories = 150;
                    result=("venti\nprice is "+price+"\n"+calories+" calories");
                    break;

            }

        }else
            System.out.println("Invalid Size");
        System.out.println(result);




    }
}
