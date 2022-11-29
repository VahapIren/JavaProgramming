package day05_Concatenation;

public class ShippingAddress {
    public static void main(String[] args) {
        String name="Vahap Iren";
        String buildingNumber="123B";
        String streetName="John Branch Dr",city="McLean",state="VA",zipCode="22031A";
        System.out.println(name+"\n"+buildingNumber+" "+streetName+"\n"+city+", "+state+" "+zipCode);


        String shippingAddress=name+"\n"+buildingNumber+" "+streetName+"\n"+city+", "+state+" "+zipCode;
        System.out.println(shippingAddress);


    }
}
