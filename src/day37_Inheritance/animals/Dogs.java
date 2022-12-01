package day37_Inheritance.animals;

public class Dogs extends Animals {

    public Dogs(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void bark(){

        System.out.println(name+" is barking");
    }
}
