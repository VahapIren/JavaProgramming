package day24_CustomMethod_Return;

public class Task1 {
    public static void main(String[] args) {
        String str1="Java java javA Python pyThOn";
        String str2="python";
        System.out.println(frequencyOfWord(str1,str2));
        System.out.println(frequency(str1,str2));
    }
    public static int frequencyOfWord(String sentence,String word){
        int frequency=0;
        for (int i = 0; i < sentence.length()-(word.length()-1); i++) {
            if (sentence.substring(i,i+word.length()).equalsIgnoreCase(word)){
                frequency++;
            }
        }
        return frequency;
    }
    public static int frequency(String sent,String word){
        sent=sent.toLowerCase();
        int count=0;
        for (int i = 0; i < sent.length(); i++) {


        if (sent.contains(word)){
            sent=sent.replaceFirst(word,"");
            count++;
        }
        }
        return count;
    }
}
