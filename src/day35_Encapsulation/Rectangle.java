package day35_Encapsulation;

public class Rectangle {

    private int width,length;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width<=0){
            System.out.println("Invalid entry");
            return;
        }
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length<=0){
            System.out.println("Invalid entry");
            return;
        }
        this.length = length;
    }

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int calcArea(){
        return width*length;
    }
    public int calcPerimeter(){
        return 2*(width+length);
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", Area=" + calcArea() +
                ", Perimeter=" + calcPerimeter() +
                '}';
    }
}
