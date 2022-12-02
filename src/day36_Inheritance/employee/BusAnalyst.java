package day36_Inheritance.employee;

public class BusAnalyst extends Employee{
    public BusAnalyst(String name, char gender, int age, int id,  double salary) {
        super(name, gender, age, id, "Business Analyst", salary);
    }
}
