package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {

        ArrayList<Integer>  scores = new ArrayList<>();
        scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));

        ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59

        for (Integer score : scores) {
            if (score>=90&&score<=100){
                gradeOfA.add(score);
            } else if (score >= 80 && score < 90) {
                gradeOfB.add(score);
            } else if (score >= 70 && score < 80) {
                gradeOfC.add(score);
            } else if (score >= 60 && score < 70) {
                gradeOfD.add(score);
            } else if (score < 60&&score>=0) {
                gradeOfF.add(score);
            }
        }
        System.out.println("number of grade A = " + gradeOfA.size());
        System.out.println("number of grade B = " + gradeOfB.size());
        System.out.println("number of grade C = " + gradeOfC.size());
        System.out.println("number of grade D = " + gradeOfD.size());
        System.out.println("number of grade F = " + gradeOfF.size());

    }
}
