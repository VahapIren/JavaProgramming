package day18_NestedLoop;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int price=0,day=0,totalPrice=0,total=0;
        while (true) {
            System.out.println("which room do you want?");

            String room = scan.next();
            while (!(room.equalsIgnoreCase("kingbed")||room.equalsIgnoreCase("queenbed")||
                    room.equalsIgnoreCase("singlebed"))) {
                System.out.println("Invalid Entry.Please re-enter");
                room = scan.nextLine();
            }

            if (room.equalsIgnoreCase("kingbed")) {
                price = 120;
            } else if (room.equalsIgnoreCase("queenbed")) {
                price = 100;
            } else if (room.equalsIgnoreCase("singlebed")) {
                price = 80;
            }else{
                System.out.println("ınvalid entry.re-enter");
                room=scan.nextLine();
            }
            System.out.println("How many days will you stay?");
            day=scan.nextInt();

            System.out.println("would you like to reserve another room?");
            String answer=scan.next();

            while (!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))){
                System.out.println("Invalid Entry.Please re-enter");
                answer=scan.next();
            }
            if (answer.equalsIgnoreCase("yes")){
                totalPrice=price*day;
                total+=totalPrice;
                continue;
            } else  {
                totalPrice=price*day;
                total+=totalPrice;

                break;
            }
        }
        System.out.println("Total Price: "+total);
    }
}
