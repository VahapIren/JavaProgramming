package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String str="Java";
        char[] ch=str.toCharArray();
        System.out.println(Arrays.toString(ch));
        for(char each:str.toCharArray()){
            System.out.println(each);
        }
        String sentence="Wooden Spoon";
        String [] words=sentence.split(" ");
        System.out.println(Arrays.toString(words));
        String email="woodenspoon@cydeo.com";
        String [] arr=email.split("@");
        System.out.println(Arrays.toString(arr));

        String s="Today is nice day.Today is Friday.Today we learn Java";
        String [] sentences=s.split("\\.");
        System.out.println(Arrays.toString(sentences));
    }
}
