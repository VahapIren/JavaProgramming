package day16_ForLoopStringPractice;

public class FrequencyOfWord {
    public static void main(String[] args) {
        String sentence="Java Java Java";
        int count=0;
        for (int i=0;i<sentence.length();i++) {
            sentence = sentence.replaceFirst("Java", "");
            count++;
        }
        System.out.println(count);
    }
}
