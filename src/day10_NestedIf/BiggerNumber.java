package day10_NestedIf;

public class BiggerNumber {
    public static void main(String[] args) {
        int n1=73;
        int n2=53;
        int n3=43;
        String result="";
        result=(n1>n2&&n1>n3)?"n1 is bigger":(n2>n1&&n2>n3)?"n2 is bigger":"n3 is bigger";
        System.out.println(result);
    }
}
