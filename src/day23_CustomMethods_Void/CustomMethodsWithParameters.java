package day23_CustomMethods_Void;

public class CustomMethodsWithParameters {
    public static void main(String[] args) {

        oddOrEven(8);
        ageOfPerson(1977);
        ageOfPerson(1983);
        printNumbers(13,28);

    }
    public static void oddOrEven(int num){
        if (num%2==0){
            System.out.println(num+" is even number");
        }else{
            System.out.println(num+" is odd number");
        }
    }

    public static void ageOfPerson(int birthYear){
        int age=2022-birthYear;
        System.out.println("Your age is "+age);
    }

    public static void printNumbers(int x,int y){
        for (int i = x; i <=y; i++) {
            System.out.print(i+" ");
        }
    }
}
