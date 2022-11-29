package day24_CustomMethod_Return;

public class ReturnSratement {
    public static void main(String[] args) {
        nameOfDay(2);

    }
    public static void nameOfDay(int number){

        if (number<1||number>7){
            System.out.println("Invalid");
            return;//exits nameOfDay method
        }
        if (number==1){
            System.out.println("MON");
        } else if (number==2) {
            System.out.println("TUE");
        }else if (number==3) {
            System.out.println("WED");
        }else if (number==4) {
            System.out.println("THU");
        }else if (number==5) {
            System.out.println("FRI");
        }else if (number==6) {
            System.out.println("SAT");
        }else  {
            System.out.println("SUN");
        }


    }
}
