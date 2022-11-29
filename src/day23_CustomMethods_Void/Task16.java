package day23_CustomMethods_Void;
import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your full name");
        String name=scan.nextLine();
        nameRegularFormat(name);

    }
    public static void nameRegularFormat(String fullName){
        fullName=fullName.toLowerCase();
        String [] fname=fullName.split(" ");
        fname[0]=fname[0].toUpperCase().charAt(0)+fname[0].substring(1);
        fname[1]=fname[1].toUpperCase().charAt(0)+fname[1].substring(1);
        System.out.println(fname[0]+" "+fname[1]);
    }

}
