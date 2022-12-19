package day39_Recap.shapeTask;

public class Square extends Shape{
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side <= 0){
            System.err.println("Invalid Side: "+side);
            System.exit(1);
        }

        this.side = side;
    }

    //                              -100
    public Square(double side) {
        super("Square");
        setSide(side);
    }


    public double area() {
        return side * side;
    }


    public double perimeter() {
        return side * 4;
    }


    public String toString() {
        return "Square{" +
                "side=" + side +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }


    public static class ShapeObject {
        public static void main(String[] args) {

            Square square = new Square(10);

            System.out.println(square);

            // square.side = -10000000;
            square.setSide( 15 );

            System.out.println(square);

            System.out.println(square.getName());

            System.out.println("------------------------");

            Rectangle rectangle = new Rectangle(5, 6);

            System.out.println(rectangle);

            rectangle.setLength(10);

            System.out.println( rectangle.getLength() );

            System.out.println( rectangle);

            System.out.println(rectangle.getName());

            System.out.println("------------------------");

            Circle circle = new Circle(7.5);

            System.out.println(circle);

            //circle.radius = 15.5;

            circle.setRadius(15.5);

            System.out.println( circle.getRadius() );

            System.out.println(circle);

            System.out.println(circle.getName());






        }


    }
}
