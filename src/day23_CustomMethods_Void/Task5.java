package day23_CustomMethods_Void;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your score:");
        int score=scan.nextInt();
        gradeOfStudent(score);

    }
    public static void gradeOfStudent(int score){
        if (score >=90){
            System.out.println("Your grade is A");
        } else if (score>=80&&score<90) {
            System.out.println("Your grade is B");
        } else if (score>=70&&score<80) {
            System.out.println("Your grade is C");
        } else if (score>=60&&score<70) {
            System.out.println("Your grade is D");
        }else{
            System.out.println("Your grade is F");
        }
    }

}
