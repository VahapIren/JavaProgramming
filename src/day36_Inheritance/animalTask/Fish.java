package day36_Inheritance.animalTask;

public class Fish extends Animal{

    public Fish(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }
    public void breed(){
        System.out.println(name+" is breeding");
    }
}
