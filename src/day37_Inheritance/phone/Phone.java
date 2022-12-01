package day37_Inheritance.phone;

public class Phone {

    public String brand,model,size;
    public double price;
    public String color;

    public static boolean hasBattery;

    public Phone(String brand, String model, String size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }

    static {
        hasBattery=true;
    }



}
