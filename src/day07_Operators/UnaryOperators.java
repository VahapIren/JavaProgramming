package day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {
        int num1=+25;
        int num2=-25;
        System.out.println(num1>0);
        System.out.println(num2>0);
        System.out.println("-----------------------------------");

        int a=5;
       // ++a;//pre increment
        System.out.println(a);
        --a;//pre decrement
        System.out.println(a);

        System.out.println("-------------------------------------" );

        int b=100;
        System.out.println(++b);//pre increment

        int c=100;
        System.out.println(c++);//post increment
        System.out.println(c);//101

        System.out.println("----------------------------------------");
        int x=200;
        System.out.println(--x);//pre decrement 199

        int y=200;
        System.out.println(y--);//post decrement first current value, then decrease value by 1
        System.out.println(y);

        System.out.println("----------------------------------------");
        int z=45;
        System.out.println(++z);//46,z=46
        System.out.println(z++);//46,z=47
        System.out.println(z);//47

        int q=30;
        System.out.println(--q);//29,q=29
        System.out.println(q--);//29,q=28
        System.out.println(q);//28





    }
}
