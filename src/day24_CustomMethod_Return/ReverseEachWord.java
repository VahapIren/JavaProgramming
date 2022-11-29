package day24_CustomMethod_Return;

public class ReverseEachWord {
    public static void main(String[] args) {
        String str = "Adam come here";
        System.out.println(reverseEachWords(str));
    }
    public static String reverseEachWords(String str){
      String res="";
       String[] result=str.split(" ");
        for (String each : result) {
            for (int i = each.length()-1; i >=0 ; i--) {
                res+=each.charAt(i);
            }
            res+=" ";
        }
        return res;
    }

}
