package day35_Encapsulation;

public class PersonObject {
    public static void main(String[] args) {
        Person person1=new Person("vahap",45,'M',"Turkish");
        person1.eat("apple");
        Person.printPlanetName();
        person1.printPlanetName();
    }
}
