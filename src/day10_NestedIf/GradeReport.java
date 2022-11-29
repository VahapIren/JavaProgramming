package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {
        int score=95;
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

        }else{
            System.out.println("Invalid Score");
        }
        System.out.println("-----------------------");
        String result="";
        if (score>=0&&score<=100){
            if(score>=90){
                result="Excellent-A";
            } else if (score>=80) {
                result="Great-B";
            } else if (score>=70) {
                result="Good-C";
            } else if (score>=60) {
                result="Passed-D";
            }else{
                result="Failed-F";
            }

        }else{
            result="Invalid Score";
        }
        System.out.println(result);
    }
}
