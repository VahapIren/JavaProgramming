package day17_While_DoWhile;

import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int result=0;
        System.out.println("enter first number");
        int num1=scan.nextInt();
        System.out.println("enter second number");
        int num2=scan.nextInt();
        System.out.println("enter math operator");
        char op=scan.next().charAt(0);
        while (!(op=='+'||op=='-'||op=='*'||op=='/')){
            System.out.println("Invalid operator.Please re-enter");
            op=scan.next().charAt(0);
        }
        result=(op=='+')?num1+num2:(op=='-')?num1-num2:(op=='*')?num1*num2:num1/num2;
        System.out.println(result);


    }
}
