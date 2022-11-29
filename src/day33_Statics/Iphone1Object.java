package day33_Statics;

public class Iphone1Object {
    public static void main(String[] args) {

        Iphone1 iphone1=new Iphone1("13ProMax",1000);
        iphone1.call(1234556955);
        iphone1.faceTime(1234567890);
        iphone1.faceTime("vahapiren@gmail.com");
        iphone1.text(1234567890);
        System.out.println(iphone1);



    }
}
