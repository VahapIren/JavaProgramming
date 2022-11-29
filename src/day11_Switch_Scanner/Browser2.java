package day11_Switch_Scanner;

import java.util.Scanner;

public class Browser2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("browser name:");
        String browserName=scan.next();
        //boolean validName=browserName=="chrome"||browserName=="firefox"||browserName=="opera"||browserName=="safari"||browserName=="edge";
        switch (browserName){
            case "chrome":
            case "firefox":
            case "opera":
            case "safari":
            case "edge":
                System.out.println("Valid");
                break;
            default:
                System.out.println("Invalid");

        }


    }
}
