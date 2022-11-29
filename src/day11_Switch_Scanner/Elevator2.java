package day11_Switch_Scanner;

public class Elevator2 {
    public static void main(String[] args) {
        int floorNumber=1;
        String result="";
        if (floorNumber==1||floorNumber==2||floorNumber==3) {
            switch (floorNumber) {
                case 1:
                    result = "Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
                    break;
                case 2:
                    result = "Floor 2 selected. Companies: Cybertek, NASA, Intelsat";
                    break;
                case 3:
                    result = "Floor 3 selected. Companies: Lyft, BofA, Stake house";
                    break;


            }
        }else
            result="Invalid floor";
        System.out.println(result);

    }
}
