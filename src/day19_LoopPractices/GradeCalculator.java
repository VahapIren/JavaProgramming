package day19_LoopPractices;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        char result;

        while (true) {
            System.out.println("Enter your score");
            int score=scan.nextInt();
            if (score<=0||score>100){
                System.err.println("Invalid Entry");
                System.exit(0);
            }
            if (score>=90){
                result='A';
            } else if (score>=80) {
                result='B';
            } else if (score>=70) {
                result='C';
            } else if (score>=60) {
                result='D';
            }else {
                result='F';
            }
            System.out.println("your grade ==> "+result);
            System.out.println("Would you like to continue?yes/no");
            String answer=scan.next();
            while (!(answer.equals("yes")||answer.equals("no"))){
                System.err.println("Invalid Entry");
                System.exit(0);
            }
            if (answer.equals("yes")){
                continue;
            }else{
                System.out.println("Thank you for using Cydeo Grade Calculator");
                break;
            }


        }
    }
}
