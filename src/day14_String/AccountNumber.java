package day14_String;

import java.util.Scanner;

public class AccountNumber {
   public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter an account number");
        String accountNumber=scan.next();
        boolean isValid=(accountNumber.startsWith("2")&&accountNumber.length()==7)||(accountNumber.startsWith("5")&&accountNumber.length()==10);
        if(isValid){

        }else {
            System.out.println("Invalid Account Number");
        }
    }
}
