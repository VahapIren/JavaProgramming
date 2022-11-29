package day09_IfStatements;

public class Tasks {
    public static void main(String[] args) {
        int num1=32,age=23,grade=23,
            num2=24;
        String name="John";
        if(num1>num2){
            System.out.println(num1+" is maximum number");
        }else{
            System.out.println(num2+" is maximum number");
        }

        System.out.println("-------------------------------");

        if(num1<num2){
            System.out.println(num1+" is minimum number");
        }else{
            System.out.println(num2+" is minimum number");
        }
        System.out.println("---------------------------------");
        if(age>=18){
            System.out.println(name+" is eligible to buy alcohol");
        }else{
            System.out.println(name+" isnt eligible to buy alcohol");
        }
        System.out.println("-------------------------------------");
        if(age>=21){
            System.out.println(name+" is eligible to vote");
        }else {
            System.out.println(name+" isn't eligible to vote");
        }
        System.out.println("---------------------------------------");
        if(grade>=90&&grade<=100){
            System.out.println("A");
        } else if (grade>=80) {
            System.out.println("B");
        } else if (grade>=70) {
            System.out.println("C");
        } else if (grade>=60) {
            System.out.println("D");
        }else if (grade<60&&grade>=0){
            System.out.println("E");
        }else {
            System.out.println("Invalid Note");
        }
        System.out.println("-----------------------");
        long  a = 30L;

        long  b= (short) a;
        System.out.println("b = " + (long)b);


    }
}
