package day33_Statics;

public class Iphone {
    public static String brand="Apple";
    public String model;
    public double price;
    public static String OS="IOS";
    public  String color;
    public static String size;
    public static String madeIn="China";
    public static boolean hasBattery=true;
    public static boolean isTouchScreen=true;
    public static boolean hasFaceTime=true;

    public static void printOS(){
        System.out.println(OS);
    }
    //public static void printModelAndPrice(){
     //   System.out.println(model+" : "+price);
   // }

    public void method1(){
        System.out.println(model+" : "+price);
        System.out.println(OS);
    }

}
