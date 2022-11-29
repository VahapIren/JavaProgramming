package day08_IfStatement;

public class NumberOfDays {
    public static void main(String[] args) {
        int dayNumber=5;
        boolean a=dayNumber==1;
        boolean b=dayNumber==2;
        boolean c=dayNumber==3;
        boolean d=dayNumber==4;
        boolean e=dayNumber==5;
        boolean f=dayNumber==6;
        boolean g=dayNumber==7;
        if(a){
            System.out.println(dayNumber+". day is Monday");
        }
        if(b){
            System.out.println(dayNumber+". day is Tuesday");
        }
        if(c){
            System.out.println(dayNumber+". day is Wednesday");
        }
        if(d){
            System.out.println(dayNumber+". day is Thursday");
        }
        if(e){
            System.out.println(dayNumber+". day is Friday");
        }
        if(f){
            System.out.println(dayNumber+". day is Saturdayday");
        }
        if(g){
            System.out.println(dayNumber+". day is Sunday");
        }

    }
}
