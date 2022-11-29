package day33_Statics;

public class CarObject {
    public static void main(String[] args) {

        Car car1=new Car("Honda","Jazz","SkyBlue",2005,10000);
        System.out.println(car1);

        System.out.println(Car.numberOfWheels);
        System.out.println(Car.hasBattery);
        System.out.println(Car.hasSeats);

    }
}
