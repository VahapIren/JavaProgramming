package day37_Inheritance.phone;

public class PhoneShop {
    public static void main(String[] args) {

        IPhone iPhone1=new IPhone("IPhone 12","6.7 inches",1000,"Black");
        Samsung samsung1=new Samsung("Galaxy S19","6 inches",900,"White");
        Nokia nokia1=new Nokia("Brick","4 inches",50,"Gray");

        System.out.println(iPhone1);
        System.out.println(samsung1);
        System.out.println(nokia1);

        iPhone1.call(911);
        iPhone1.text(1234567543);
        iPhone1.faceTime(78965432);
        iPhone1.faceTime("yahoo@gmail.com");

        samsung1.call(911);
        samsung1.text(1223432123);
        samsung1.freeze();

        nokia1.call(911);
        nokia1.text(12343234);
        nokia1.selfDefense();
        System.out.println("----------------------------");

        System.out.println(IPhone.hasBattery);
        System.out.println(Samsung.hasBattery);
        System.out.println(Nokia.hasBattery);
        System.out.println(iPhone1.hasBattery);

    }
}
