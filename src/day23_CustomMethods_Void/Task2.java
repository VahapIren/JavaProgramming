package day23_CustomMethods_Void;

public class Task2 {
    public static void main(String[] args) {

        evenNumbers();

    }
    public static void evenNumbers(){
        for (int i = 1; i <101 ; i++) {
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
    }

}
