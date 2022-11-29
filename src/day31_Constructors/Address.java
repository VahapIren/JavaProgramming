package day31_Constructors;

public class Address {
    public int buildingNumber;
    public String street,city,state;
    public int zipCode;

    public Address(int buildingNumber, String street, String city, String state, int zipCode) {
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String toString() {
        return buildingNumber +" "+ street +"\n"
                 + city +" "+ state +", "+ zipCode;
    }

    public static void main(String[] args) {
        Address add1=new Address(7925,"John Branch Dr","Mclean","VA",22012);
        System.out.println(add1);

    }
}
