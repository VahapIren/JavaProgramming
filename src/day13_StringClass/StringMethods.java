package day13_StringClass;

public class StringMethods {
    public static void main(String[] args) {
        String word="Cydeo";
        char third=word.charAt(2);

        System.out.println("third = " + third);
        System.out.println("------------------------");
        String s1="Batch EU10 is the best batch";
        int totalCharacter=s1.length();
        System.out.println(totalCharacter);
        char lastChar=s1.charAt(totalCharacter-1);
        System.out.println("lastChar = " + lastChar);
        System.out.println("----------------");
        String str1="wooden spoon";
        str1=str1.toUpperCase();
        System.out.println(str1);
        String s="JAVA";
        s=s.toLowerCase();
        System.out.println(s);
        String sentence="Today is great day to learn java programming language";
        sentence=sentence.toUpperCase();
        System.out.println(sentence);

    }
}
