package officeHours;

import java.util.Scanner;

public class WhilePractices {
    public static void main(String[] args) {
        one();
        two();
        three();
        four();
        five();
        six();
    }

    public static void one(){
        int count=1;
        while (count<=10){
            count*=2;
        }
        count=count-10;
        System.out.println("count = " + count);
    }

    public static void two() {
        int count=100;
        while (count<100){
            count+=1;
        }
        System.out.println("count = " + count);
    }
    public static void three() {
        int i=1;
        do {
            if (i%2==0)
                System.out.print(" "+i);
            i++;
        }while (i<11);
    }

    public static void four() {
        for (int i = 1; i <50 ; i++) {
            if (i%5!=0)
                continue;

            System.out.println(i);

        }
    }

    public static void five(){
        String str="abcdefghijklmnoprrstuvwyz";
        String result="";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
                result+=str.charAt(i);
        }
        System.out.println(result);

    }

    public static void six() {
        String password="Cyde123!";
        Scanner scan=new Scanner(System.in);
        int guessNo=0;
        while (true){
            System.out.println("Enter your password");
            String guess=scan.next();
            if (guess.equals(password)){
                System.out.println("Welcome to dashboard");
                break;
            }
            guessNo++;
            if (guessNo==3){
                System.out.println("your account is deactivated");
                break;

            }



        }
    }

}
