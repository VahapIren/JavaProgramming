package day38_Inheritance.shapeTask;

public class Rectangle extends Shape{

    public int l,w;

    public Rectangle( int l, int w) {
        super("Rectangle");
        this.l = l;
        this.w = w;
    }
    public double area(){
        return l*w;
    }

    @Override
    public double perimeter() {
        return 2*(l+w);
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", length=" + l +
                ", width=" + w +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                "} " ;
    }
}
