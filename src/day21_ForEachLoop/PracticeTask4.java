package day21_ForEachLoop;

public class PracticeTask4 {
    public static void main(String[] args) {

        String[] str={"anna", "level", "Java","cac"};

        int count=0;
        for (String each : str) {
            String result="";
            for (int i = each.length()-1; i >=0 ; i--) {
                result+=each.charAt(i);
            }
            System.out.println(result);
            if (each.equals(result)){
                count++;
            }
        }
        System.out.println(count);


    }
}
