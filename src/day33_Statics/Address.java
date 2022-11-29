package day33_Statics;

public class Address {

    public String street,city,state;
    public int zipCode;

    public static String country="USA",planet="World";

    public Address(String street, String city, String state, int zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }


    public String toString() {
        return "Address:\n" +
                street+"\n"+
                city+" "+state+", "+zipCode;
    }
}
