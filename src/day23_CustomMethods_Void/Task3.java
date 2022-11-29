package day23_CustomMethods_Void;

public class Task3 {
    public static void main(String[] args) {

        eligibleBuyAlcohol(13);

    }
    public static void eligibleBuyAlcohol(int age){
        if (age>18){
            System.out.println("You are eligible to buy alcohol");
        }else {
            System.out.println("You are not eligible to buy alcohol");
        }
    }

}
