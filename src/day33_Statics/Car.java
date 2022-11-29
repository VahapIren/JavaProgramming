package day33_Statics;

public class Car {

    public String make,model,color;
    public int year;
    public double price;

    public static int numberOfWheels;
    public static boolean hasBattery,hasSeats;

    public Car(String make, String model, String color, int year, double price) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
        numberOfWheels=4;
        hasBattery=true;
        hasSeats=true;
    }
    public void drive(){
        System.out.println("you are driving "+make+" "+model);
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price= $" + price +
                '}';
    }
}
