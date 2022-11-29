package day08_IfStatement;

public class SalaryCalculator {
    public static void main(String[] args) {
        int hourlyRate=65,
            weeklyHours=40;
        double stateTaxRate=0,
                federalTaxRate=26.2;
        System.out.println("---------------------------");
        int salaryBeforeTax=hourlyRate*weeklyHours*52;
        double stateTax=salaryBeforeTax*stateTaxRate/100;
        double federalTax=salaryBeforeTax*federalTaxRate/100;
        double totalTax=stateTax+federalTax;
        double salaryAfterTax=salaryBeforeTax-totalTax;

        System.out.println("Gross pay is $"+salaryBeforeTax);
        System.out.println("StateTax = $" + stateTax);
        System.out.println("FederalTax = $" + federalTax);
        System.out.println("TotalTax = $" + totalTax);
        System.out.println("Net income= $"+salaryAfterTax);

    }
}
