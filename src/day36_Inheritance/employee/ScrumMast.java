package day36_Inheritance.employee;

public class ScrumMast extends Employee{
    public ScrumMast(String name, char gender, int age, int id, double salary) {
        super(name, gender, age, id, "Scrum Master", salary);
    }
}
