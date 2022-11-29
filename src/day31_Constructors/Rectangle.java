package day31_Constructors;

public class Rectangle {
    public double lenght,width;

    public Rectangle(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
    }

    public double calculateArea(){
        return lenght*width;
    }
    public double calculatePerimeter(){
        return 2*(lenght+width);
    }


    public String toString() {
        return "Regtangle{" +
                "lenght=" + lenght +
                ", width=" + width +
                ", area=" + calculateArea() +
                ", perimeter=" + calculatePerimeter() +
                '}';
    }
}
