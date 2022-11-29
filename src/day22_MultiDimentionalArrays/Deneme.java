package day22_MultiDimentionalArrays;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Deneme {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            double premium=0;
            System.out.println("Enter your full name");
            String name=scan.nextLine();
            String fname=name.toUpperCase().charAt(0)+name.substring(1,name.indexOf(" "));
            String lname=name.toUpperCase().charAt(name.indexOf(" ")+1)+name.substring(name.indexOf(" ")+2);
            name=fname+" "+lname;
            System.out.println("Do you have a US driver license?");
            String answer=scan.next();
            if (answer.equals("no")){
                System.out.println("You must have a license to get insurance!" );
                System.exit(0);
            }
            System.out.println("Enter your zip code");
            int zipCode=scan.nextInt();
            if (zipCode==20910||zipCode==20740){
                premium+=60;
            } else if (zipCode==22102||zipCode==22103) {
                premium+=30;
            }else{
                premium+=50;
            }
            System.out.println("Is this vehicle owned, financed, or leased?");
            String vehicle=scan.next();
            if (vehicle.equals("owned")){
                premium+=10;
            } else if (vehicle.equals("financed")) {
                premium+=15;
            } else if (vehicle.equals("leased")) {
                premium+=20;
            }
            System.out.println("How is this vehicle primarily used?");
            String primaryUse=scan.next();
            if (primaryUse.equals("business")){
                premium+=50;
            } else if (primaryUse.equals("pleasure")) {
                premium+=10;
            } else if (primaryUse.equals("commuting")) {
                premium+=20;
                System.out.println("How many days do you commute?");
                int days=scan.nextInt();
                premium+=(5*days);
            }
            System.out.println("How old are you?");
            int age=scan.nextInt();
            if (age<16){
                System.out.println("You can't be driving");
                System.exit(0);
            } else if (age>=16&&age<20) {
                premium+=premium*0.10;
            } else if (age>=20&&age<25) {
                premium+=premium*0.06;
            }else {
                premium+=premium*0.02;
            }
            System.out.println("Have you had any accidents in the last 5 years?");
            String accident=scan.next();
            if (accident.equals("Yes")||accident.equals("YES")){
                System.out.println("How many?");
                int accNumber=scan.nextInt();
                premium+=accNumber*10;
            }
            System.out.println("What is the highest level of education you have completed?");
            scan.nextLine();
            String education=scan.nextLine();
            if (education.equals("Bachelors")||education.equals("Masters")){
                premium-=premium*0.05;
            } else if (education.equals("PHD")) {
                premium-=premium*0.10;
            } else if (education.equals("High School")) {
                premium+=premium*0.10;
            }
            String reference=fname.toUpperCase().substring(0,2)+age+name.toUpperCase().substring(name.indexOf(" ")+2)+zipCode+education.toUpperCase();
            System.out.println(name+", here's your quote!");
            System.out.println("This is your start premium cost: "+premium);
            System.out.println("This is your reference number: "+reference);


        }
}
