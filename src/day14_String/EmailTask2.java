package day14_String;

import java.util.Scanner;

public class EmailTask2 {
    public static void main(String[] args) {
        String email="mike_tyson@gmail.com";
        String name=email.substring(0,email.indexOf("_"));
        System.out.println(name.toUpperCase().charAt(0)+name.toLowerCase().substring(1));
        String surName=email.substring(email.indexOf("_")+1,email.indexOf("@"));
        System.out.println(surName.toUpperCase().charAt(0)+surName.toLowerCase().substring(1));
        String domain=email.substring(email.indexOf("@")+1,email.indexOf("."));
        System.out.println(domain.toUpperCase().charAt(0)+domain.toLowerCase().substring(1));

        Scanner scan=new Scanner(System.in);
        double totalPrice=0;
        System.out.println("Select screen size:");
        double scSize=scan.nextDouble();
        if(scSize==13){
            totalPrice+=200;
        }else if(scSize==15.0){
            totalPrice+=300;

        }else if(scSize==17.3){
            totalPrice+=400;
        }
        System.out.println(totalPrice);
        System.out.println("Select CPU type:");
        String cpu=scan.next();
        switch (cpu){
            case "i3":
                totalPrice+=150;
                break;
        }
        System.out.println(totalPrice);
        System.out.println("Select RAM size:");
        int ram=scan.nextInt();
        totalPrice+=(ram/4)*50;
        System.out.println(totalPrice);

        System.out.println("Select storage type:");
        String type=scan.next();
        System.out.println("Select storage size:");
        int size=scan.nextInt();
        if(type=="HDD"){
            totalPrice+=(size/500)*50;
        }else if(type=="SSD"){
            totalPrice+=(size/500)*100;
        }
        System.out.println(totalPrice);
        System.out.println("Select screen resolution:");
        String resolution=scan.next();
        if(resolution=="FULLHD"){
            totalPrice+=100;
        }else if(resolution=="4K"){
            totalPrice+=200;
        }
        System.out.println("Laptop price is:"+totalPrice);
    }
}
