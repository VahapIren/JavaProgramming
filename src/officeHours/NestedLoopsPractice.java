package officeHours;

import java.util.Scanner;

import static officeHours.WhilePractices.three;

public class NestedLoopsPractice {
    public static void main(String[] args) {

//one();
//two();
three();
    }

    private static void two() {
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();
        int total=0;
        for (int i = 0; i <= number; i++) {
            for (int j = 0; j <=number; j++) {
                for (int k = 0; k <= number; k++) {
                    if (i+j+k==number){
                        System.out.println(""+i+j+k);
                        total++;
                    }
                }
            }
        }
        System.out.println(total);
    }

    public static void one(){
        for (int i = 1; i <11 ; i++) {
            for (int j = 1; j <11 ; j++) {
                System.out.print(j+"x"+i+"="+(i*j)+" ");
            }
            System.out.println();
        }

    }

    public static void three(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
