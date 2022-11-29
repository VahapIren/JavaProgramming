package day23_CustomMethods_Void;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter circle radius");
        int radius=scan.nextInt();
        areaOfCircle(radius);

    }
    public static void areaOfCircle(int radius){
        double PI=3.14;
        double area=radius*radius*PI;
        System.out.println("Area of circle is "+area);
    }

}
