package day35_Encapsulation;

public class Candy {
    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanuts;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {

        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity<=0)
            return;
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price<0)
            return;
        this.price = price;
    }

    public boolean isHasPeanuts() {
        return hasPeanuts;
    }

    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }

    public Candy(String brand, int quantity, double price, boolean hasPeanuts) {
        this.brand = brand;
        setQuantity(quantity);
        setPrice(price);
        this.hasPeanuts = hasPeanuts;
    }

    public String toString() {
        String str="";
        if (price==0)
            str="free";
        else
            str="$"+price;
        return "Candy{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", price=" + str +
                ", hasPeanuts=" + hasPeanuts +
                '}';
    }
}
