package day24_CustomMethod_Return;

import java.util.Scanner;
public class WaterTax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(waterTax(in.nextDouble()));
    }
    public static double waterTax(double units){
        double bill=0;
        if (units<=50){
            bill = units * 0.60;
        } else  {
            bill = units * 0.90;
            if (units>150){
                bill+=100;
            } else if (units>100) {
                bill+=50;
            }
        }
        return bill;
    }
}
