package day36_Inheritance.employee;

public class ProOwn extends Employee{
    public ProOwn(String name, char gender, int age, int id,  double salary) {
        super(name, gender, age, id, "Product Owner", salary);
    }
}
