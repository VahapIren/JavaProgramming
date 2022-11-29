package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your full name:");
        String name=scan.nextLine();

        System.out.println("Enter your Programming Language:");
        String prog=scan.nextLine();

        System.out.println("Enter your age:");
        int age= scan.nextInt();

        scan.nextLine();//nextLine doesnt ignore Enter key
                        //capture the Enter key that user pressed for nextInt
        System.out.println("Enter your school name");
        String schoolName=scan.nextLine();
        System.out.println("name = " + name);
        System.out.println("prog = " + prog);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);
    }
}
