package day36_Inheritance.animalTask;

public class Tiger extends Animal{

    public Tiger(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }
    public void swim(){
        System.out.println(name+" is swimming");
    }
}

