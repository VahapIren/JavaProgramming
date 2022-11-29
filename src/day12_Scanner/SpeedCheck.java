package day12_Scanner;

import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {
        int speedLimit=55,result;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter current speed:");
        int currentSpeed=scan.nextInt();
        if (currentSpeed>speedLimit){
            result=currentSpeed-speedLimit;
            System.out.println("You're driving "+result+" mph over the limit. Slow down!");
        }
    }
}
