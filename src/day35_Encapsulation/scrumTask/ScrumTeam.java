package day35_Encapsulation.scrumTask;


import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    private String PA,SM,BA;
    private ArrayList<Tester> testersList=new ArrayList<>();
    private ArrayList<Developer> devopsList=new ArrayList<>();
    private int dayaOfSprint;

    public ScrumTeam(String PA, String SM, String BA,int dayaOfSprint) {
        setPA(PA);
        setBA(BA);
        setSM(SM);
        setDayaOfSprint(dayaOfSprint);
    }

    public String getPA() {
        return PA;
    }

    public void setPA(String PA) {
        this.PA = PA;
    }

    public String getSM() {
        return SM;
    }

    public void setSM(String SM) {
        this.SM = SM;
    }

    public String getBA() {
        return BA;
    }

    public void setBA(String BA) {
        this.BA = BA;
    }

    public int getDayaOfSprint() {
        return dayaOfSprint;
    }

    public void setDayaOfSprint(int dayaOfSprint) {
        this.dayaOfSprint = dayaOfSprint;
    }

    public void addTester(Tester tester){
        for (Tester tester1 : testersList) {
            if (tester1.getEmployeeID()==tester.getEmployeeID())
                return;
        }
        testersList.add(tester);
    }
    public void addTesters(Tester[] testers){
        for (Tester tester : testersList) {
            for (int j = 0; j < testers.length; j++) {
                if (tester.getEmployeeID() == testers[j].getEmployeeID()) {
                    System.out.println("Employee ID "+tester.getEmployeeID() + " is already exist please change Employee ID");
                    return;
                }
            }
        }
        testersList.addAll(Arrays.asList(testers));
    }
    public void addDeveloper(Developer developer){
        for (Developer developer1 : devopsList) {
            if (developer1.getEmployeeID()==developer.getEmployeeID())
                return;
        }
        devopsList.add(developer);
    }
    public void addDevelopers(Developer[] developers){
        for (Developer developer : devopsList) {
            for (int j = 0; j < developers.length; j++) {
                if (developer.getEmployeeID() == developers[j].getEmployeeID()) {
                    System.out.println("Employee ID "+developer.getEmployeeID() + " is already exist please change Employee ID");
                    return;
                }
            }
        }
        devopsList.addAll(Arrays.asList(developers));
    }
    public void removeTester(int employeeID){
        testersList.removeIf(p->p.getEmployeeID()==employeeID);
    }
    public void removeDeveloper(int employeeeID){
        devopsList.removeIf(p->p.getEmployeeID()==employeeeID);
    }

    public String toString() {
        return "ScrumTeam{" +
                "PA='" + PA + '\'' +
                ", SM='" + SM + '\'' +
                ", BA='" + BA + '\'' +
                ", total number of testers=" + testersList.size() +
                ", total number of developers=" + devopsList.size() +
                ", dayaOfSprint=" + dayaOfSprint +
                '}';
    }
}
