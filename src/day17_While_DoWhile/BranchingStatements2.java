package day17_While_DoWhile;

import java.util.Scanner;

public class BranchingStatements2 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        for (char i = 'A'; i <='E' ; i++) {
            if (i=='C'){
                continue;//for skipping
            }
            System.out.println(i);
        }
        System.out.println("-----------------");

        for (int i = 1; i <=10 ; i++) {
            if (i%2==0){
                continue;
            }
            System.out.println(i);

        }
        System.out.println("-----------------");

        for (int i = 1; i <=10 ; i++) {
            if (i % 2 == 1) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("-------------------------");


    }
}
