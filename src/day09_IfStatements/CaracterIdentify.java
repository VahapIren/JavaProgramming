package day09_IfStatements;

public class CaracterIdentify {
    public static void main(String[] args) {
        char ch='1';
        if((ch>=65&&ch<=90)||(ch>=97&&ch<=122)){
            System.out.println(ch+" is Alphabetic Character");
        }else if (ch>=48&&ch<=57) {
            System.out.println(ch+" is Digit");
        }else{
            System.out.println(ch+" is Special Character");
        }

    }
}
