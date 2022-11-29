package day10_NestedIf;

public class Loans {
    public static void main(String[] args) {
        int salary=65000;
        int creditScore=600;
        String result="";
        result=(salary>=60000&&creditScore>=650)?"Loan Approved":"Loan Denied";
        System.out.println(result);
    }
}
