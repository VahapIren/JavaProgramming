package day38_Inheritance.shapeTask;

public class Circle extends Shape{
     static double pi=3.14;
     public int radius;

    public Circle(int radius) {
        super("Circle");
        this.radius=radius;
    }
    public double area(){
        return  (radius*radius*pi);
    }
    public double perimeter(){
        return radius*pi*2;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", radius=" + radius +
                ", pi='" + pi + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                "} " ;
    }
}
