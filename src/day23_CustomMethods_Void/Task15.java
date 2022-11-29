package day23_CustomMethods_Void;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 1. number");
        int number1=scan.nextInt();
        System.out.println("Enter 2. number");
        int number2=scan.nextInt();
        System.out.println("Enter math operator");
        char ch=scan.next().charAt(0);
        calculator(number1,number2,ch);

    }
    public static void calculator(int num1,int num2,char mathOperator){
        double result=0;
        switch (mathOperator){
            case '+':
                result=num1+num2;
                break;
            case '-':
                result=num1-num2;
                break;
            case '*':
                result=num1*num2;
                break;
            case '/':
                result=num1/num2;
                break;
        }
        System.out.println(result);
    }

}
