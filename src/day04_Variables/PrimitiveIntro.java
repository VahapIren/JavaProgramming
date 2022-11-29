package day04_Variables;

public class PrimitiveIntro {
    public static void main(String[] args) {
        //age:38 years old
        byte age=38;
        //weight:169 pounds
        //byte weight= 160; 160 out of byte range
        short weight=160;//160 within rage of short
        //salary=100000 $
        //short salary=100000; 1000000 out of short range
        int salary=100000;//int is prefered for integer numbers.
        long asset= 3_333_333_333L;
        //tax:0.26
        //int tax=0.26; ondalıklı sayılar için double or float
        float tax=0.26F;
        double PI=3.14;

        char ch1='#';//char always give single character
        char ch2=35;
        char ch3=35001;
        char ch4=15000;
        //char ch5='AB'; hata verir!!!
        System.out.println("ch1 = " + ch1);
        System.out.println("ch2 = " + ch2);
        System.out.println("ch3 = " + ch3);
        System.out.println("ch4 = " + ch4);
        System.out.println("ch5 = " + ch4);
        char gender='M';
        char grade='F';
        char yesNo='Y';

        boolean isMarried=true;
        //boolean isEmployed=maybe; sadece true/false alır
        boolean result=100>30;
        System.out.println("result = " + result);
        System.out.println("isMarried = " + isMarried);
        System.out.println("result = " + result);


        String name="Wooden Spoon";
        String city="McLaren";
        String state="Columbia";
        String country="USA";
        System.out.println("name = " + name);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("country = " + country);






    }
}
