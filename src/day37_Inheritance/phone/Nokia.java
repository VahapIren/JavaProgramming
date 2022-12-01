package day37_Inheritance.phone;

public class Nokia extends Phone{

    public Nokia(String model, String size, double price, String color) {
        super("Nokia", model, size, price, color);
    }

    public void selfDefense(){
        System.out.println(brand+" "+model+" is self defense tool");
    }
}
