package day31_Constructors.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
   public String PA,SM,BA;
   public ArrayList<Tester> testersList=new ArrayList<>();
   public ArrayList<Developer> devopsList=new ArrayList<>();
   int dayaOfSprint;

    public ScrumTeam(String PA, String SM, String BA, int dayaOfSprint) {
        this.PA = PA;
        this.SM = SM;
        this.BA = BA;
        this.dayaOfSprint = dayaOfSprint;
    }

    public void addTester(Tester tester){
        testersList.add(tester);
    }
    public void addTesters(Tester[] testers){
        testersList.addAll(Arrays.asList(testers));
    }
    public void addDeveloper(Developer developer){
        devopsList.add(developer);
    }
    public void addDevelopers(Developer[] developers){
        devopsList.addAll(Arrays.asList(developers));
    }
    public void removeTester(int employeeID){
        testersList.removeIf(p->p.employeeID==employeeID);
    }
    public void removeDeveloper(int employeeeID){
        devopsList.removeIf(p->p.employeeID==employeeeID);
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
