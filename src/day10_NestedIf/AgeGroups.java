package day10_NestedIf;

public class AgeGroups {
    public static void main(String[] args) {
        int age=62;
        String ageGroup="";
        if(age>=0&&age<=150){
            if(age<21){
                ageGroup="Teenager";
            } else if (age<55) {
                ageGroup="Adult";
            }else
                ageGroup="Senior";
            System.out.println(ageGroup);


        }else
            System.out.println("Invalid");
    }
}
