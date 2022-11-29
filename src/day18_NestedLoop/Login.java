package day18_NestedLoop;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter  username");
        String u=scan.next();
        System.out.println("Enter password");
        String p=scan.next();

        if (u.equals("Cydeo")&&p.equals("WoodenSpoon")){
            System.out.println("Logged-In");
        }else {
            for (int i = 0; i < 3; i++) {
                System.out.println("Incorrect username or password");
                System.out.println("Enter  username");
                u=scan.next();
                System.out.println("Enter password");
                p=scan.next();
                if (u.equals("Cydeo")&&p.equals("WoodenSpoon")){
                    System.out.println("Logged-In");
                    break;
                }
            }
            if (!(u.equals("Cydeo")&&p.equals("WoodenSpoon"))){
                System.out.println("your account is locked.Contact with support team");
            }
        }

    }
}
