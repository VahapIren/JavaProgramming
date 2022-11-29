package day10_NestedIf;

public class FieldTrip {
    public static void main(String[] args) {
        int gradeNumber=6;
        String location="";
        int groupNumber;
        String teacher="";
        if(gradeNumber>=1&&gradeNumber<=6){
            if(gradeNumber==1){
                location="apple Orchard";
                groupNumber=3;
                teacher="Ms. Smith";
            } else if (gradeNumber==2) {
                location="Zoo";
                groupNumber=7;
                teacher="Mr. Lee";
            } else if (gradeNumber==3) {
                location="Aquarium";
                groupNumber=5;
                teacher="Ms. Wilson";
            } else if (gradeNumber==4) {
                location="Movie Theatre";
                groupNumber=2;
                teacher="Ms. Reyes";
            } else if (gradeNumber==5) {
                location="Museum";
                groupNumber=5;
                teacher="Ms. Lela";
            }else {
                location="Six Flag";
                groupNumber=8;
                teacher="Mr. Watt";
            }
            System.out.println("Location - "+location);
            System.out.println("Number of Groups - "+groupNumber);
            System.out.println("Teacher in charge - "+teacher);
        }else {
            System.out.println("Invalid Grade");
        }
    }
}
