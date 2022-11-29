package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {
    public static void main(String[] args) {
        System.out.println(10+4);//14 addition
        System.out.println(100-50);//50 subtraction
        System.out.println("12"+1);//121 concatenation
        System.out.println(10*6);//60 multiplication

        System.out.println(100/3);//in java 100/3=33
        System.out.println(10.0/4);//2.5
        System.out.println(10/4.0);//2.5
        System.out.println(10d/4);//2.5
        /*
        integer/integer==>integer
        decimal/integer==>decimal
        integer/decimal==>decimal
        decimal/decimal==>decimal
         */
        int a=100;
        double b=a/6;//16
        System.out.println(b);

        double c=a/6.0;//a/6d or (double)a/6 or
        System.out.println(c);

        System.out.println(100D);//100.0




    }
}
