package day08_IfStatement;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        int number=11;
        boolean has28Days=number==2;
        boolean has30Days=number==4||number==6||number==9||number==11;
        boolean has31Days=!has28Days&&!has30Days&&number<=12;

        if (has28Days){
            System.out.println(number+". month has 28 days");
        }
        if(has30Days){
            System.out.println(number+". month has 30 days");
        }
        if(has31Days){
            System.out.println(number+". month has 31 days");
        }


    }
}
