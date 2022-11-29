package day35_Encapsulation;

public class Pizza {

    private String size;
    private int numberOfCheeseTopping,numberOfPepperoniTopping;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (!(size.equalsIgnoreCase("small")||size.equalsIgnoreCase("medium")
                ||size.equalsIgnoreCase("large"))){
            System.out.println("Invalid entry");
            return;
        }
        this.size = size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        if (numberOfCheeseTopping<3||numberOfCheeseTopping>5){
            System.out.println("Invalid entry");
            return;
        }
        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        if (numberOfPepperoniTopping<4||numberOfPepperoniTopping>6){
            System.out.println("Invalid entry");
            return;
        }
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }
    int cost=0;
    public int calcCost(){
        if (size.equalsIgnoreCase("small")){
            cost+=10;
        } else if (size.equalsIgnoreCase("medium")) {
            cost+=12;
        }else
            cost+=14;
        cost+=(getNumberOfPepperoniTopping()+getNumberOfPepperoniTopping())*2;
        return cost;
    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", cost=" + calcCost() +
                '}';
    }
}
