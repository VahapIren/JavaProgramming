package day36_Inheritance.employee;

public class Tester extends Employee{


    public Tester(String name, char gender, int age, int id, String jobTitle, double salary) {
        super(name, gender, age, id, jobTitle, salary);
    }

    public void test(){
        System.out.println(name+" is testing");
    }
    public void creatingTicket(){
        System.out.println(name+" is creating ticket");
    }




}
