package day24_CustomMethod_Return;

public class PrintEachWord {
    public static void main(String[] args) {
        String str="Given a sentence which is string and count the words in it.";
        printWords(str);

    }

    public static void printWords(String str) {
        String result="";
        String [] arr=str.split(" ");
        for (String s : arr) {
            System.out.println(s);
        }
        System.out.println("--------------------------------");

        for (int i = 0; i < str.length(); i++) {


                if (str.charAt(i) == ' ') {
                    result = str.substring(0, str.indexOf(' '));
                    System.out.println(result);
                    str = str.substring(str.indexOf(' ') +1);
                    i-=result.length();
                    continue;
                }


        }
        System.out.println(str);
    }
}
