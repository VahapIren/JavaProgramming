package day24_CustomMethod_Return;

public class HowManyTimes {
    public static void main(String[] args) {
        String str="Hello cydeo hello java hello everyone hello";
        String word="HeLlO";
        System.out.println(howMany(str, word));

    }

    public static int howMany(String str, String word) {
        int count=0;
        for (int i = 0; i < str.length()-word.length()+1; i++) {
            if (str.substring(i,i+word.length()).equalsIgnoreCase("hello"))
                count++;
        }
        return count;
    }


}
