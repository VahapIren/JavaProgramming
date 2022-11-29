package day17_While_DoWhile;

import java.util.Scanner;

public class InsuranceQuote {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        double coverPrice=0;
        System.out.println("enter your name");
        String name=scan.nextLine();
        System.out.println("enter your gender?m/f");
        char gender=scan.next().toLowerCase().charAt(0);
        while (!(gender=='m'||gender=='f')){
            System.out.println("Invalid entry.Please re-enter");
            gender=scan.next().toLowerCase().charAt(0);
        }
        System.out.println("Are you married?yes/no");
        String married=scan.next().toLowerCase();
        while (!(married.equalsIgnoreCase("yes")||married.equalsIgnoreCase("no"))){
            System.out.println("Invalid entry .Please reenter");
            married=scan.next().toLowerCase();
        }
        System.out.println("what is your age");
        int age=scan.nextInt();
        while ((age<=0||age>=120)) {
            System.out.println("Invalid entry .Please reenter");
            age = scan.nextInt();
        }
        System.out.println("how many miles do you drive a day");
        int miles=scan.nextInt();
        while ((miles<0)) {
            System.out.println("Invalid entry .Please reenter");
            miles = scan.nextInt();
        }
        System.out.println("Are you want full coverage or lineability insurance?full/linea");
        String cover=scan.next();
       while (!(cover.equalsIgnoreCase("full")||cover.equalsIgnoreCase("linea"))){
           System.out.println("Invalid entry .Please reenter");
           cover = scan.next();

        }
        System.out.println("Did you have any accidents or claims in past 5 years?yes/no");
       String acc=scan.next();
       while (!(acc.equalsIgnoreCase("yes")||acc.equalsIgnoreCase("no"))){
           System.out.println("Invalid entry.Please re-enter");
           acc=scan.next();
       }
        System.out.println("Is your car has antitheft device?yes/no");
        String device=scan.next();
        while (!(device.equalsIgnoreCase("yes")||device.equalsIgnoreCase("no"))) {
            System.out.println("Invalid entry.Please re-enter");
            device = scan.next();

        }
        if (cover.equalsIgnoreCase("linea")) {
            if (age < 25) {
                coverPrice = 90;
            } else {
                coverPrice = 50;
            }
            if (miles <= 10) {
                coverPrice += 10;
            } else if (miles > 10 && miles <= 50) {
                coverPrice += 30;
            } else {
                coverPrice += 50;
            }
        }else{
            if (age < 25) {
                coverPrice = 160;
            } else {
                coverPrice = 120;
            }
            if (miles <= 10) {
                coverPrice += 20;
            } else if (miles > 10 && miles <= 50) {
                coverPrice += 40;
            } else {
                coverPrice += 70;
            }
        }
        if (device.equalsIgnoreCase("yes")){
            coverPrice-=coverPrice*0.05;
        }
        if (acc.equalsIgnoreCase("yes")){
            coverPrice+=coverPrice*0.15;
        }else{
            coverPrice-=coverPrice*0.10;
        }
        if (married.equalsIgnoreCase("yes")){
            coverPrice-=coverPrice*0.05;
        }
        System.out.println(name+", your insurance price is: "+coverPrice);

        }


    }

