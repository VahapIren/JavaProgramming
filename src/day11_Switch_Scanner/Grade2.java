package day11_Switch_Scanner;

public class Grade2 {
    public static void main(String[] args) {
        char ch='A';
        String result="";
        switch (ch){
            case 'A':
                System.out.println("Passed");
            case 'B':
                System.out.println("Passed");
            case 'C':
                System.out.println("Passed");
            case 'D':
                System.out.println("Passed");
            default:
                System.out.println("Failed");
        }
        switch (ch){
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                result="Passed";
                break;
            case 'F':
                result="Failed";
                break;
            default:
                result="Invalid";
        }
        System.out.println(result);
    }
}
