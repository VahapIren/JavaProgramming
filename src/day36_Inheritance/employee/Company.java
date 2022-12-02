package day36_Inheritance.employee;

import java.util.ArrayList;

public class Company {
    public ProOwn PO;
    public BusAnalyst BA;
    public ScrumMast SM;
    public ArrayList<Tester> testers=new ArrayList<>();
    public ArrayList<Developer> developers=new ArrayList<>();
    public ArrayList<Teacher> teachers=new ArrayList<>();
    public ArrayList<Driver> drivers=new ArrayList<>();

    public Company(ProOwn PO, BusAnalyst BA, ScrumMast SM) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
    }

    public void addTester(Tester tester){
        for (Tester tester1 : testers) {
            if (tester1.getId()==tester.getId()){
                System.out.println("Employee ID "+tester.getId()+" is already exist");
                return;
            }

        }
        testers.add(tester);
    }

    public void addDeveloper(Developer developer){
        for (Developer developer1 : developers) {
            if (developer1.getId()==developer.getId());
            System.out.println("Employee ID "+developer.getId()+" is already exist");
            return;
        }

        developers.add(developer);
    }

    public void addTaecher(Teacher teacher){
        for (Teacher teacher1 : teachers) {
            if (teacher1.getId()==teacher.getId()){
                System.out.println("Employee ID "+teacher.getId()+" is already exist");
                return;
            }
        }
        teachers.add(teacher);
    }

    public void addDriver(Driver driver){
        for (Driver driver1 : drivers) {
            if (driver1.getId()==driver.getId()){
                System.out.println("Employee ID "+driver.getId()+" is already exist");
                return;
            }
        }
        drivers.add(driver);
    }



    public String toString() {
        return "Company{" +
                "PO='" + PO.getName() + '\'' +
                ", SM='" + SM.getName() + '\'' +
                ", BA='" + BA.getName() + '\'' +
                ", testers=" + testers.size() +
                ", developers=" + developers.size() +
                ", teachers=" + teachers.size() +
                ", drivers=" + drivers.size() +
                '}';
    }
}
