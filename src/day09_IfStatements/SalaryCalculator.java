package day09_IfStatements;

public class SalaryCalculator {
    public static void main(String[] args) {
        double tax,salaryAfterTax;
        int salary=60000;
        boolean isMarried=false;
        if(salary>=130000) {
            if (isMarried) {
                tax = 0.30;
            } else {
                tax = 0.35;
            }
            salaryAfterTax = salary - (salary * tax);
            System.out.println("salaryAfterTax = " + salaryAfterTax);
        } else if (salary>=100000) {
            if (isMarried) {
                tax = 0.25;
            } else {
                tax = 0.30;
            }
            salaryAfterTax = salary - (salary * tax);
            System.out.println("salaryAfterTax = " + salaryAfterTax);
        } else if (salary>=80000) {
            if (isMarried) {
                tax = 0.20;
            } else {
                tax = 0.25;
            }
            salaryAfterTax = salary - (salary * tax);
            System.out.println("salaryAfterTax = " + salaryAfterTax);
        }else {
            if (isMarried) {
                tax = 0.15;
            } else {
                tax = 0.20;
            }
            salaryAfterTax = salary - (salary * tax);
            System.out.println("salaryAfterTax = " + salaryAfterTax);
        }
    }
    }

