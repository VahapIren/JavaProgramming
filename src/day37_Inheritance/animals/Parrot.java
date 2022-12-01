package day37_Inheritance.animals;

public class Parrot extends Animals {

    // public String parrotWingColor;

    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
        // this.parrotWingColor = parrotWingColor;
    }

    public void sing(){
        System.out.println(name+" is singing");
    }

}
