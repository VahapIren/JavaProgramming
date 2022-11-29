package day17_While_DoWhile;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int price=0;
        String roomType="";
        System.out.println("Want to reserve a room?yes/no");
        String answer=scan.next();
        while (!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))){
            System.out.println("enter valid answer");
            answer=scan.next();
        }
        scan.nextLine();
        if (answer.equalsIgnoreCase("yes")){
            System.out.println("Which type of room");
            roomType=scan.nextLine();

            while (!(roomType.equalsIgnoreCase("King bed")||roomType.equalsIgnoreCase("single bed")||roomType.equalsIgnoreCase("Queen bed"))){
                System.out.println("enter valid room type");
                roomType=scan.nextLine();
            }
            if (roomType.equalsIgnoreCase("King bed")){
                price=120;
                System.out.println("king bed: "+price+"$");
            } else if (roomType.equalsIgnoreCase("single bed")) {
                price=100;
                System.out.println("single bed: "+price+"$");
            }else {
                price=80;
                System.out.println("queen bed: "+price+"$");

            }
        } else if (answer.equalsIgnoreCase("no")) {
            System.out.println("Have a nice day");
        }





    }
}
