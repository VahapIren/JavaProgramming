package day09_IfStatements;

public class FieldTrip {
    public static void main(String[] args) {
        int gradeNumber=4;
        String location,teacherInCharge;
        int numberOfGroups;
        if(gradeNumber==1){
            location="Apple Orchard";
            teacherInCharge="Ms. Smith";
            numberOfGroups=3;
            System.out.println("Location = " + location);
            System.out.println("Number Of Groups = " + numberOfGroups);
            System.out.println("Teacher In Charge = " + teacherInCharge);
        } else if (gradeNumber==2) {
            location="Zoo";
            teacherInCharge="Mr. Lee";
            numberOfGroups=7;
            System.out.println("Location = " + location);
            System.out.println("Number Of Groups = " + numberOfGroups);
            System.out.println("Teacher In Charge = " + teacherInCharge);
        } else if (gradeNumber==3) {
            location="Aquarium";
            teacherInCharge="Ms. Wilson";
            numberOfGroups=5;
            System.out.println("Location = " + location);
            System.out.println("Number Of Groups = " + numberOfGroups);
            System.out.println("Teacher In Charge = " + teacherInCharge);
        } else if (gradeNumber==4) {
            location="Movie Theatre";
            teacherInCharge="Ms. Reyes";
            numberOfGroups=2;
            System.out.println("Location = " + location);
            System.out.println("Number Of Groups = " + numberOfGroups);
            System.out.println("Teacher In Charge = " + teacherInCharge);
        } else if (gradeNumber==5) {
            location="Museum";
            teacherInCharge="Ms. Lela";
            numberOfGroups=5;
            System.out.println("Location = " + location);
            System.out.println("Number Of Groups = " + numberOfGroups);
            System.out.println("Teacher In Charge = " + teacherInCharge);
        } else if (gradeNumber==6) {
            location="Six Flags";
            teacherInCharge="Mr. Watt";
            numberOfGroups=8;
            System.out.println("Location = " + location);
            System.out.println("Number Of Groups = " + numberOfGroups);
            System.out.println("Teacher In Charge = " + teacherInCharge);
        }



        /*
        Create a class called FieldTrip. Your school goes on a Field trip each
year. The place you go will be based on your grade. Given a variable
gradeNumber (1-6) figure out the details of your field trip. Print the
information at the end.
Data based on grade:
grade - 1
location -  Apple orchard
number of groups - 3
teacher in charge - Ms. Smith
grade - 2
location - Zoo
number of groups - 7
teacher in charge - Mr. Lee
grade - 3
location - Aquarium
number of groups - 5
teacher in charge - Ms. Wilson
grade - 4
location - Movie theater
number of groups - 2
teacher in charge - Ms. Reyes
grade - 5
location - Museum
number of groups - 5
teacher in charge - Ms. Lela
grade - 6
location - Six Flags
number of groups - 8
teacher in charge - Mr. Watt
         */
    }
}
