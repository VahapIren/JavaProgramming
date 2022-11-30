package day36_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog=new Dog("Max","Husky",'M',2,"Small","white");
        dog.eat();
        dog.drink();
        dog.move();
        dog.sleep();
        dog.bark();
        System.out.println(dog);

        Cat cat=new Cat("Tarcin","British",'M',3,"Small","brown");
        cat.eat();
        cat.drink();
        cat.sleep();
        //tiger.bark();
        cat.move();
        cat.scratch();
        System.out.println(cat);

        Tiger tiger =new Tiger("Sher","Bengal",'F',4,"Large","red");
        tiger.swim();
        System.out.println(tiger);






    }


}
