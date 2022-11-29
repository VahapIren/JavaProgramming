package day35_Encapsulation;

public class Item {

    private String name;
    private double unitPrice;
    private int quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
       char[] name1=name.toCharArray();
        for (char each : name1) {
            if (!(Character.isLetterOrDigit(each)||each==' ')){
                System.out.println("invalid entry");
                return;
            }
        }
        if (name.isEmpty()||name.isBlank()){
            System.out.println("Invalid entry");
            return;
        }

        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice<=0){
            System.out.println("Invalid entry");
            return;
        }
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity<=0){
            System.out.println("Invalid entry");
            return;
        }
        if (name.equalsIgnoreCase("toilet paper")){
            if (quantity>1){
                System.out.println("Quantity cant be more than 1");
                return;
            }
        }
        this.quantity = quantity;
    }

    public Item(String name, double unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public double calcCost(){
        return unitPrice*quantity;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", Total Price=" + calcCost() +
                '}';
    }
}
