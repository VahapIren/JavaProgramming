package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {
        String firstName="Betul";
        String lastName="Iren";
        String fullName=firstName+" "+lastName;
        int age=15;
        String jobTitle="SDET";
        String company="App Inc.";

        double salary=150000;

        System.out.println(firstName+" "+lastName);
        System.out.println("Full name of person is "+fullName);
        System.out.println(fullName+" is "+age+" yaers old");

        System.out.println(fullName+" is "+jobTitle+", work at "+company+", and "+fullName+"'s salary is $"+salary);


    }
}
