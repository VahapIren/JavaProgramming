package day08_IfStatement;

public class SwapTwoNumbers_WithTemporarilyVariable {
    public static void main(String[] args) {
        int a=10;
        int b=15;
        System.out.println("--------------------------");
        int c;
        c=b;//c=15
        b=a;//b=10
        a=c;//a=15

        System.out.println("---------------------------");
        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }
}
