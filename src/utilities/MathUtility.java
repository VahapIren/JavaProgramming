package utilities;

public class MathUtility {

    //sum of two integer numbers
    public static int sum(int num1,int num2){
        return num1+num2;
    }

    public static double sum(double num1,double num2){
        return num1+num2;
    }

    //substraction of two integer numbers
    public static int substraction(int num1,int num2){
        return num1-num2;
    }

    public static double substraction(double num1,double num2){
        return num1-num2;
    }

    //multiplication of two integer numbers
    public static int multiplication(int num1,int num2){
        return num1*num2;
    }

    public static double multiplication(double num1,double num2){
        return num1*num2;
    }

    //division of two number
    public static double division(double num1,double num2){
        return num1/num2;
    }

    //check if the integer number is even number, return boolean
    public static boolean isEven(int num){
        boolean result=num%2==0;
        return result;
    }

    //check if the integer number is odd number, return boolean
    public static boolean isOdd(int num){
        boolean result=num%2==1;
        return result;
    }

    //maximum number between two integers
    public static int maxNumber(int num1,int num2){
        if (num1>num2)
            return num1;
        else
            return num2;
    }

    public static double maxNumber(double num1,double num2){
        if (num1>num2)
            return num1;
        else
            return num2;
    }

    //minimum number between two integers
    public static int minNumber(int num1,int num2){
        if (num1<num2)
            return num1;
        else
            return num2;
    }

    public static double minNumber(double num1,double num2){
        if (num1<num2)
            return num1;
        else
            return num2;
    }

    //square of an integer
    public static int square(int num){
        return num*num;
    }

    public static double square(double num){
        return num*num;
    }

    //cube of an integer
    public static int cube(int num){
        return num*num*num;
    }

    public static double cube(double num){
        return num*num*num;
    }


}
