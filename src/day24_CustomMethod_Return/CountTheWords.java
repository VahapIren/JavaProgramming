package day24_CustomMethod_Return;

public class CountTheWords {
    public static void main(String[] args) {
        String str="Given a sentence which is string and count the words in it.";
        System.out.println(countWords(str));
        System.out.println(xxx(str));

    }

    public static int countWords(String str) {
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==' ')
                count++;
        }
        return count+1;
    }
    public static int xxx(String str){
        String [] xxx=str.split(" ");
        return xxx.length;
    }

}
