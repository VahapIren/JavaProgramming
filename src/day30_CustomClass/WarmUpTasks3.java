package day30_CustomClass;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUpTasks3 {
    public static void main(String[] args) {

        String str="ABCD123$%&#@456EF!";
        char[] ch=str.toCharArray();
        ArrayList<Character> chars=new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            chars.add(str.charAt(i));
        }
        System.out.println(chars);

        ArrayList<Character> letters=new ArrayList<>(chars);
        letters.removeIf(p-> !Character.isLetter(p));
        System.out.println(letters);

        ArrayList<Character> digits=new ArrayList<>(chars);
        digits.removeIf(p->!Character.isDigit(p));
        System.out.println(digits);

        ArrayList<Character> specialChar=new ArrayList<>(chars);
        //specialChar.removeAll(letters);
        //specialChar.removeAll(digits);
        specialChar.removeIf(p->Character.isLetterOrDigit(p));
        System.out.println(specialChar);

    }
}
