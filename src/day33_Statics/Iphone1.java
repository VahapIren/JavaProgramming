package day33_Statics;

public class Iphone1 {

    public String model;
    public double price;

    public static String brand,OS,madeIn;

    public Iphone1(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public void faceTime(long phoneNumber){
        System.out.println("you are calling with facetime this number "+phoneNumber);
    }
    public void faceTime(String email){
        System.out.println("your email is "+email);
    }
    public void call(long phoneNumber){
        System.out.println("you are calling "+phoneNumber);
    }
    public void text(long phoneNumber){
        System.out.println("you are texting "+phoneNumber);
    }

    public String toString() {
        return "Iphone1{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
