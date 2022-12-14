package day38_Inheritance.shapeTask;

public class Square extends Shape{
    public int s;

    public Square( int s) {
        super("Square");
        this.s = s;
    }

    @Override
    public double area() {
        return s*s;
    }

    @Override
    public double perimeter() {
        return s*4;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", side=" + s +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                "} ";
    }
}
