package day10_NestedIf;

public class Grade {
    public static void main(String[] args) {
        char grade='F';
        String str="";
        if(grade>='A'&&grade<='F'&&grade!='E'){
            if (grade == 'A') {
                str="Excellent";
            } else if (grade=='B') {
                str="Great Job";
            } else if (grade=='C') {
                str="Good";
            } else if (grade=='D') {
                str="Passed";
            }else
                str="Failed";
            System.out.println(str);
        }else
            System.out.println("Invalid");
    }
}
