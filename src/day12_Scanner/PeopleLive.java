package day12_Scanner;

import java.util.Scanner;

public class PeopleLive {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("how many people they live with:");
        int liveWith= scan.nextInt();
        if (liveWith<3){
            System.out.println("Live with less than 3 people");
        } else if (liveWith>=3&&liveWith<=6) {
            System.out.println("Live with 3 - 6 people");
        }else {
            System.out.println("Live with more than 6 people");
        }

    }
}
