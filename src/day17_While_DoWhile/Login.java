package day17_While_DoWhile;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your user name");
        String u=scan.next();
        System.out.println("Enter your password name");
        String p=scan.next();
        if (u.equals("Cydeo")&&p.equals("Cydeo123")){
            System.out.println("Logged In");
        }else{
            int attempt=3;
            while (!(u.equals("Cydeo")&&p.equals("Cydeo123"))&&attempt>0){
                if (attempt==1){
                    System.err.println("THIS IS LAST CHANCE");
                }
                System.out.println("Incorrect username or password. please re-enter");
                System.out.println("Enter your user name");
                u=scan.next();
                System.out.println("Enter your password name");
                p=scan.next();
                attempt--;
            }
        }
        if (u.equals("Cydeo")&&p.equals("Cydeo123")) {
            System.out.println("Logged In");
        }else {
            System.out.println("your account is locked");
        }





    }
}
