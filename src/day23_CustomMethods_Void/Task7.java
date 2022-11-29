package day23_CustomMethods_Void;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter square side");
        int side=scan.nextInt();
        areaOfSquare(side);

    }
    public static void areaOfSquare(int side){
        int area=side*side;
        System.out.println("Area of square is "+area);
    }

}
