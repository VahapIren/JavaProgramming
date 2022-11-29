package day35_Encapsulation.encapsulation;

public class EmployeeObject {
    public static void main(String[] args) {

        Employee employee1=new Employee("Tatiana",28,'F',110000);
        System.out.println(employee1);
        employee1.setAge(32);
        System.out.println(employee1);
        employee1.setAge(-20);
        System.out.println(employee1);

        Employee employee2=new Employee("Aygun",31,'F',120000);
        employee2.setSalary(employee2.getSalary()+5000);
        employee2.setName("Hulya");

        System.out.println(employee2);


    }

}
