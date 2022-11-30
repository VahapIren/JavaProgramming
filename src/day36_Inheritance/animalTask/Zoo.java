package day36_Inheritance.animalTask;

import day35_Encapsulation.Carpet;

public class Zoo {
    public static void main(String[] args) {

        Dog dog=new Dog();
        dog.setInfo("Max","Husky",'M',2,"Small","white");
        dog.eat();
        dog.drink();
        dog.move();
        dog.sleep();
        dog.bark();
        System.out.println(dog);

        Cat cat=new Cat();
        cat.setInfo("Tarcin","British",'M',3,"Small","brown");
        cat.eat();
        cat.drink();
        cat.sleep();
        //tiger.bark();
        cat.move();
        cat.scratch();
        System.out.println(cat);

        Tiger tiger=new Tiger();
        tiger.setInfo("Sher","Bengal",'F',4,"Large","red");
        tiger.eat();
        tiger.sleep();
        tiger.move();
        tiger.drink();
        tiger.hunt();
        tiger.roar();
        //tiger.bark();
        System.out.println(tiger);



    }


}
