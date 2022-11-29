package day24_CustomMethod_Return;

public class LongestPalindrome {
    public static void main(String[] args) {
     String[] str={"java","longer word","civic","apple","racecar","mom","anna"};
        longestPalindrome(str);

    }
        public static void longestPalindrome(String [] str){
        int longest=0;String ress="";
        for (String each:str) {
            String result = "";
            for (int i = each.length() - 1; i >= 0; i--) {
                result += each.charAt(i);
            }
            if (each.equalsIgnoreCase(result)) {
                if (result.length() > longest){
                    longest=result.length();
                    ress=each;
                }

            }
        }
            System.out.println(ress);
        if (longest==0)
            System.out.println("No Palindrome");
        }

}
