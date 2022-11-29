package day16_ForLoopStringPractice;

public class UnıqueCharacters {
    public static void main(String[] args) {

        String str="aaabccc";
        String result="";
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            System.out.println(ch);


        if (str.indexOf(ch)==str.lastIndexOf(ch)){
            result+=ch;
        }

        }
        System.out.print(result);
    }
}
