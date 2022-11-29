package day10_NestedIf;

public class GradeReport2 {
    public static void main(String[] args) {
        int score=15;
        if (score>=0&&score<=100){
            if(score>=90){
                System.out.println("Excellent-A");
            } else if (score>=80) {
                System.out.println("Great-B");
            } else if (score>=70) {
                System.out.println("Good-C");
            } else if (score>=60) {
                System.out.println("Passed-D");
            }else{
                System.out.println("Failed-F");
            }

        }else {
            System.out.println("Invalid Score");
        }
        //with tenaries
        String result=(score>=0&&score<=100)?(score>=90)?"Excellent":(score>=80)?"Great":(score>=70)?"Good":(score>=60)?"Passed":"Failed"
                :"Invalid Score";

        //different solution

        String result2="";
        System.out.println(result);
        if (score>=0&&score<=100){
            result2=(score>=90)?"Excellent":(score>=80)?"Great":(score>=70)?"Good":(score>=60)?"Passed":"Failed";
        }else {
            result2="Invalid Score";
        }
        System.out.println(result2);
    }
}
