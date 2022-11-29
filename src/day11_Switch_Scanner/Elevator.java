package day11_Switch_Scanner;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a floor:");
        int floorNumber=scan.nextInt();
        String result="";
        if (floorNumber==1){
            result="Floor 1 selected. \nCompanies: Lobby, Verizon, Starbucks";
        } else if (floorNumber==2) {
            result="Floor 2 selected. \nCompanies: Cybertek, NASA, Intelsat";
        } else if (floorNumber==3) {
            result="Floor 3 selected. \nCompanies: Lyft, BofA, Stake house";
        }else
            System.out.println("Invalid Floor");
        System.out.println(result);
    }


}
