package day11_Switch_Scanner;

public class NumberOfDays {
    public static void main(String[] args) {
        int year=2000;
        int number=2;
        String result="";
        if(number>=1&&number<=12){
            switch (number){
                case 2:
                   /* if(year%4==0){
                        System.out.println("29 days");
                    }else {
                        System.out.println("28 days");
                    }*/
                    result=(year%4==0)?"29 days":"28 days";
                    break;
                case 4: case 6: case 9: case 11:
                    System.out.println("30 days");
                    break;
                default:
                    System.out.println("31 days");

            }

        }else
            result="Invalid";
        System.out.println(result);
    }
}
