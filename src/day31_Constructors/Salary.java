package day31_Constructors;

public class Salary {
    public double hourlyRate,stateTaxRate,federalTaxRate;
    int weeklyHours;

    public Salary(double hourlyRate, double stateTaxRate, double federalTaxRate, int weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }

    public double salary(){
        return (hourlyRate*weeklyHours)*52;
    }
    public double stateTax(){
        return salary()*stateTaxRate;
    }
    public double federalTax(){
        return salary()*federalTaxRate;
    }
    public double salaryAfterTax(){
        double salary=salary();
        salary-= stateTax();
        salary-=federalTax();
        return salary;
    }


    public String toString() {
        return "Salary{" +
                "salary= $" + salary() +
                ", State Tax=" + stateTax() +
                ", Federal Tax=" + federalTax() +
                ", Salary After Tax=" + salaryAfterTax() +
                '}';
    }

    public static void main(String[] args) {
        Salary emp1=new Salary(50,0.10,0.11,40);
        Salary emp2=new Salary(45,0.08,0.10,45);
        System.out.println(emp1);
        System.out.println(emp2);
    }


}
