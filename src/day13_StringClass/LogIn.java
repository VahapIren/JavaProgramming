package day13_StringClass;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("User Name:");
        String userName=scan.next();
        System.out.println("password");
        String password=scan.next();
        if (userName.equals("Cydeo")&&password.equals("WoodenSpoon")){
            System.out.println("Logged in");

        }else{
            System.out.println("Incorrect username or password");
        }

    }
}
