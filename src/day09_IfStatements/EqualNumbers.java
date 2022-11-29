package day09_IfStatements;

public class EqualNumbers {
    public static void main(String[] args) {
        int n1=22,n2=2,n3=2;
        if(n1==n2&&n1==n3){
            System.out.println("All Equal");
        } else if (n1==n2) {
            System.out.println("n1&n2 are equal");
        } else if (n2==n3) {
            System.out.println("n2&n3 are equal");
        } else if (n3==n1) {
            System.out.println("n1&n3 are equal");
        }else {
            System.out.println("none of them are equal");
        }
    }
}
