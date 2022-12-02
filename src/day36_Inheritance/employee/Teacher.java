package day36_Inheritance.employee;

public class Teacher extends Employee{


    public Teacher(String name, char gender, int age, int id, String jobTitle, double salary) {
        super(name, gender, age, id, jobTitle, salary);
    }

    public void teach(){
        System.out.println(name+" is teaching");
    }


}
