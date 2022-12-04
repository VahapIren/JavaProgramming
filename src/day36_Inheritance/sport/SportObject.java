package day36_Inheritance.sport;

public class SportObject {
    public static void main(String[] args) {

        Football football=new Football();
        System.out.println(football);

        Basketball basketball=new Basketball();
        System.out.println(basketball);

        AmericanFootball americanFootball=new AmericanFootball(11,7,"touchdown,field goal");
        System.out.println(americanFootball);


    }
}
