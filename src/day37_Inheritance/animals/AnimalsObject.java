package day37_Inheritance.animals;

public class AnimalsObject {

    public static void main(String[] args) {

        Dogs dog1 = new Dogs("Alex", "Husky", 'M',1,"Small","White");

        System.out.println(dog1);

        dog1.bark();
        //dog1.scratch();
        //dog1.sing();



        Cats cat1 = new Cats("Love", "Siamese",'F',2,"Large","Black");

        System.out.println(cat1);
        cat1.scratch();
        //  cat1.bark();
        //  cat1.sing();


        Parrot parrot1 = new Parrot("King","Macaw",'M', 3,"Small", "Blue");

        System.out.println(parrot1);

        parrot1.sing();
        //  parrot1.bark();
        //  parrot1.scratch();


    }

}
