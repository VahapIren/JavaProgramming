package day07_Operators;

public class LeapYear {
    public static void main(String[] args) {
        int year=2020;
        boolean result=year%4==0;
        if (result){
            System.out.println(year+" is leap year:"+result);
        }else{
            System.out.println(year+" is leap year:"+result);
        }
        int a=10,b=15,c;
        c=b;
        b=a;
        a=c;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("---------------------------------------");
        byte age=18;
        String name="Josh";
        if(age>=18) {
            System.out.println(name +" is eligible to buy cigarette");
        }
        System.out.println("-------------------------------------------");
        byte age1=20;
        String name1="Oswald";
        if (age1<1){
            System.out.println(name1+" isnt eligible for school");
        }
        else if (age1<=5){
            System.out.println(name1+" is in Elementary School");
        } else if (age1<=8) {
            System.out.println(name1+" is in Middle School");
        } else if (age1<=12) {
            System.out.println(name1+" is in High School");
        } else if (age1<=16) {
            System.out.println(name1+" is in College");
        } else if (age1<=18) {
            System.out.println(name1+" is in Grad SChool");
        }else {

            System.out.println(name1+" graduates from School");
        }
        System.out.println("--------------------------------------");
        int num1=300,num2=200;
        if(num1>num2){
            System.out.println(num1+" is maximum number");
        }else if (num1<num2) {
            System.out.println(num2+" is maximum number");
        }else{
            System.out.println(num1+" is equal to "+num2);
        }
    }
}
