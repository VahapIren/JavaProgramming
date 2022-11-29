package day10_NestedIf;

public class TenariesWithNestedIf {
    public static void main(String[] args) {
        int s=65;
        String result=(s>=0&&s<=100)?(s>=60)?"Passed":"Failed":"Invalid Score";
        System.out.println(result);
    }
}
