package day35_Encapsulation.encapsulation;

public class CircleObject {
    public static void main(String[] args) {

        Circle circle1=new Circle(5);
        System.out.println(circle1);
        System.out.println("circle1.getRadius() = " + circle1.getRadius());
        circle1.setRadius(4);
        System.out.println(circle1.getRadius());
        System.out.println(circle1);
        circle1.setRadius(-6);
        System.out.println(circle1.getRadius());
        System.out.println(circle1);


    }
}
