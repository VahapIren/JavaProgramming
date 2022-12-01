package day37_Inheritance.animals;

public class Cats extends Animals{


    public Cats(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }
    public void scratch(){
        System.out.println(name+" is scratching");
    }
}
