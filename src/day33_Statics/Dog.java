package day33_Statics;

public class Dog {

    public String breed,size;
    public char gender;
    public int age;
    public String color;

    public static int numberOfLegs,numberOfEyes,numberOfWings;
    public static boolean isFriendly;

    public Dog(String breed, String size, char gender, int age, String color) {
        this.breed = breed;
        this.size = size;
        this.gender = gender;
        this.age = age;
        this.color = color;
        numberOfLegs=4;
        numberOfEyes=2;
        numberOfWings=0;
        isFriendly=true;
    }

    public void eat(){
        System.out.println(breed+" is eating");
    }
    public void sleep(){
        System.out.println(breed+" is sleeping");
    }
    public void play(){
        System.out.println(breed+" is playing");
    }

    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
