package day10_NestedIf;

public class GradeLevel {
    public static void main(String[] args) {
        byte number=3;
        String school="";
        if(number>=1&&number<=18){
            if(number<=5){
                school="Elementary School";
            } else if (number<=8) {
                school="Middle School";
            } else if (number<=12) {
                school="High School";
            } else if (number<=16) {
                school="College";
            }else
                school="Grade School";
            System.out.println(school);

        }else{
            System.out.println("Invalid Grade");
        }
    }
}
