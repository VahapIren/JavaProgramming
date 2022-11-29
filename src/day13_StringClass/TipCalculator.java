package day13_StringClass;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double rate=0;
        System.out.println("Split or No split (Yes or No)?");
        String split=scan.next();
        if (split.equalsIgnoreCase("Yes")){
            System.out.println("Enter number of people");
            int peopleNum=scan.nextInt();
            System.out.println("Enter the check amount:");
            double amount=scan.nextDouble();
            System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor)");
            String service=scan.next();

            switch (service){
                case "Excellent":
                    rate=0.25;
                    break;
                case "Great":
                    rate=0.20;
                    break;
                case "Good":
                    rate=0.15;
                    break;
                case "Fair":
                    rate=0.10;
                    break;
                case "Poor":
                    rate=0.05;
                    break;
            }
            System.out.println("Number of people entered: "+peopleNum);
            System.out.println("Total to pay: "+(amount+(amount*rate)));
            System.out.println("Total tip: "+(amount*rate));
            System.out.println("Total per person: "+((amount+(amount*rate))/peopleNum));
            System.out.println("ip per person: "+((amount*rate)/peopleNum));


        }
    }
}
