package day11_Switch_Scanner;

public class Grade {
    public static void main(String[] args) {
        char ch='B';
        String result="";
        switch (ch){
            case 'A':
                System.out.println("Exacellent");
                break;
            case 'B':
                System.out.println("Great Job");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Passed");
                break;
            case 'F':
                System.out.println("Failed");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
        switch (ch){
            case 'A':
               result="Exacellent";
                break;
            case 'B':
                result="Great Job";
                break;
            case 'C':
                result="Good";
                break;
            case 'D':
                result="Passed";
                break;
            case 'F':
                result="Failed";
                break;
            default:
                result="Invalid";
                break;
        }
        System.out.println(result);
    }
}
