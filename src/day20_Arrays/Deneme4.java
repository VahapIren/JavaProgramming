package day20_Arrays;

public class Deneme4 {
    public static void main(String[] args) {

        String str = "amazon";
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            if (i == 0) {
                result += str.charAt(i);
            } else {
                result += str.charAt(i) + "-";
            }

            // result=result.substring(0,result.length()-1);


        }
        System.out.println(result);
    }
}