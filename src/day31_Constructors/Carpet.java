package day31_Constructors;

public class Carpet {
    public double width,lenght,unitPrice;
    public boolean isPersian;

    public Carpet(double width, double lenght, double unitPrice, boolean isPersian) {
        this.width = width;
        this.lenght = lenght;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calcCost(){
        double totalPrice=(width*lenght)*unitPrice;
        if (isPersian)
            totalPrice+=200;
        return totalPrice;
    }

    public String toString() {
        return "Carpet{" +"\n"+
                "width=" + width +"\n"+
                ", lenght=" + lenght +"\n"+
                ", unitPrice= $" + unitPrice +"\n"+
                ", isPersian=" + isPersian +"\n"+
                ", Total Price= $" + calcCost() +
                '}';
    }
}
