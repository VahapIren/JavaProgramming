package day13_StringClass;

import java.util.Scanner;

public class CalledTravel {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int cost=0;
        System.out.println("do you have a valid passport? (yes or no)");
        String passport=scan.next();
        if (passport.equalsIgnoreCase("yes")){
            int baseTicket=1000;
            cost=baseTicket;
            scan.nextLine();
            System.out.println("country you to travel to");
            String country=scan.nextLine();
            System.out.println("how many bags they will take with");
            byte bags=scan.nextByte();
            System.out.println("how many people they will travel with");
            short travelWith=scan.nextShort();
            if (travelWith<=3){
                cost=(cost*3)-(travelWith*100)+(bags*50);
            }else {
                cost=(cost*3)-300+(bags*50);
            }
            scan.nextLine();
            System.out.println("Enter the name of the people they will travel with in one line, " +
                    "separating each name with a comma");
            String withName=scan.nextLine();

            System.out.println("Your ticket is booked to "+country+". We have charged extra for the " +
                    bags+" bags but you are traveling with " +
                    travelWith+" so we are giving a discount. Your total cost is "+cost);
        } else if (passport.equalsIgnoreCase("no")) {
            cost=2000;
            int add=0;
            System.out.println("When your passport expired");
            int year=scan.nextInt();
            scan.nextLine();
            System.out.println("Which country you plan to travel");
            String country=scan.nextLine();
            System.out.println("if you travelling next year(yes/no)");
            String nextYear=scan.next();
            if (nextYear.equalsIgnoreCase("yes")){
                add=100;
            }else {
                add=50;
            }
            System.out.println("Looks like your password has been expired for " +
                    (2022-year)+" years, but not to worry we will get it ready for you to travel to " +
                    country+". Your total cost has come out to "+(cost+((2022-year)*75)+add));
        }
    }
}
