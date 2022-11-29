package day19_LoopPractices;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        while (true) {
            System.out.println("How much you make an hour?");
            int hourlyRate = scan.nextInt();
            if (hourlyRate <= 0) {
                System.err.println("Invalid entry for hourly rate");
                System.exit(0);
            }
            System.out.println("How many hour do you work per week?");
            int weeklyHours = scan.nextInt();
            if (weeklyHours < 1 || weeklyHours > 144) {
                System.err.println("Invalid entry for weekly hours");
                System.exit(0);
            }
            System.out.println("Enter your state rate(%)");
            int stateRate = scan.nextInt();
            if (stateRate < 0 || stateRate > 10) {
                System.out.println("Invalid entry for state tax rate");
                System.exit(0);
            }
            System.out.println("Gross Salary");
            System.out.println("Gross Salary");
            System.out.println("Gross Salary");
            System.out.println("Gross Salary");
            System.out.println("Gross Salary");

            System.out.println("Do you want to continue?yes/no");
            String answer=scan.next();
            while (!(answer.equals("yes")||answer.equals("no"))){
                System.out.println("Invalid entry!!");
                System.exit(0);
            }
            if (answer.equals("yes")){
                continue;
            }else{
                System.out.println("Thank you for using Cydeo Salary Calculator");
                break;
            }

        }
    }
}
