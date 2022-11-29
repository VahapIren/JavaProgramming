package day23_CustomMethods_Void;

public class Task4 {
    public static void main(String[] args) {
        eligibleToVote(21,"USA");
        eligibleToVote(21,"USD");

    }
    public static void eligibleToVote(int age,String country){
        if (age>19&&country.equals("USA")){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote!");
        }
    }

}
