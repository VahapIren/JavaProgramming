package day36_Inheritance.employee;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeObject {
    public static void main(String[] args) {

        ProOwn proOwn1=new ProOwn("Ali",'M',39,45,150000);
        BusAnalyst busAnalyst1=new BusAnalyst("Mehmet",'M',41,55,135000);
        ScrumMast scrumMast1=new ScrumMast("Busra",'F',36,44,120000);

     Tester tester1=new Tester("Vahap",'M',45,1,"SDET",110000);
     Developer developer1=new Developer("Ihsan",'M',35,2,"Senior Dev",120000);
     Teacher teacher1=new Teacher("Kaan",'M',38,3,"Java Teacher",10000);
     Driver driver1=new Driver("Mike",'M',40,4,"Driver",85000);

        Company company1=new Company(proOwn1,busAnalyst1,scrumMast1);
        System.out.println(company1);
        System.out.println("---------------------------------");
        company1.addTester(tester1);
        System.out.println(company1);
        company1.addTester(tester1);
        company1.addDeveloper(developer1);
        company1.addTaecher(teacher1);
        company1.addDriver(driver1);
        System.out.println(company1);

        System.out.println("--------------------------------------");

        System.out.println(tester1.getName()+" : "+tester1.getSalary());

        tester1.work();
        tester1.test();tester1.creatingTicket();

        driver1.work();
        driver1.drive();

        System.out.println(developer1);
        teacher1.teach();
        System.out.println(teacher1);




    }
}
