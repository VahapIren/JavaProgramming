package day09_IfStatements;

public class AgeGroups {
    public static void main(String[] args) {

        int age=85;
        if (age<=2){
            System.out.println("Infant");
        } else if (age<=5) {
            System.out.println("Toddler");
        } else if (age<=9) {
            System.out.println("Kid");
        } else if (age<=12) {
            System.out.println("Pre-Teen");
        } else if (age<=17) {
            System.out.println("Teenager");
        } else if (age<=20) {
            System.out.println("Young Adult");
        } else if (age<=39) {
            System.out.println("Adult");
        } else if (age<=49) {
            System.out.println("Young Middle-Aged Adult");
        } else if (age<=54) {
            System.out.println("Middle-Aged Adult");
        } else if (age<=64) {
            System.out.println("Very Young Senior Citizen");
        } else if (age<=74) {
            System.out.println("Young Senior Citizen");
        } else if (age<=84) {
            System.out.println("Senior Citizen");
        } else if (age>=85) {
            System.out.println("Old Senior Citizen");
        } else {
            System.out.println("");
        }


        /*
        infant (1 - 2)
                    Toddler (3 - 5),
                    Kid (6 - 9),
                    Pre-Teen (10 - 12),
                    Teenager (13 - 17),
                    Young Adult (18 - 20),
                    Adult (21 - 39),
                    Young Middle-Aged Adult (40 - 49),
                    Middle-Aged Adult (50 - 54),
                    Very Young Senior Citizen (55 - 64),
                    Young Senior Citizen (65 - 74),
                    Senior Citizen (75 - 84),
                    Old Senior Citizen (85+)
         */
    }
}
