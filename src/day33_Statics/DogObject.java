package day33_Statics;

public class DogObject {
    public static void main(String[] args) {

        Dog dog1=new Dog("Kangal","Large",'M',5,"White");
        dog1.eat();
        dog1.sleep();
        dog1.play();


        System.out.println(Dog.isFriendly);
        System.out.println(Dog.numberOfWings);
        System.out.println(dog1);


    }
}
