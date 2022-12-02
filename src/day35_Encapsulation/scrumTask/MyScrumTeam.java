package day35_Encapsulation.scrumTask;

public class MyScrumTeam {
    public static void main(String[] args) {

        Tester tester1=new Tester("Layan",11,"QA",110000);
        Tester tester2=new Tester("Ali",43,"SDET",142000);
        Tester tester3=new Tester("Alex",44,"SE",135000);
        Tester tester4=new Tester("Lala",23,"SDET",115000);
        Tester[] testers={tester1,tester2,tester3,tester4};

        Developer developer1=new Developer("Olga",22,"Java Developer",125000);
        Developer developer2=new Developer("Osaka",24,"Java Developer",125000);
        Developer developer3=new Developer("Tunc",28,"Software Developer",135000);
        Developer developer4=new Developer("Sinem",13,"Senior Developer",200000);
        Developer[] developers={developer1,developer2,developer3,developer4};

        ScrumTeam scrumTeam=new ScrumTeam("Vahap","Huseyin","Tolga",14);


        scrumTeam.addTester(tester2);
        System.out.println(scrumTeam);
        scrumTeam.addTesters(testers);
        System.out.println(scrumTeam);
        scrumTeam.addDeveloper(developer1);
        System.out.println(scrumTeam);
        scrumTeam.addDevelopers(developers);
        System.out.println(scrumTeam);





    }
}
