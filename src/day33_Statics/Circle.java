package day33_Statics;

public class Circle {

    public double radius,diameter;
    public static double pi=3.14;

    public Circle(double radius) {
        this.radius = radius;
        this.diameter=radius*2;
    }

    public double calcArea(){
        double area=radius*radius*pi;
        return area;
    }
    public double calcPerimeter(){
        double perimeter=diameter*pi;
        return perimeter;
    }
    public static void printPi(){
        System.out.println(pi);
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", pi=" + pi +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}
