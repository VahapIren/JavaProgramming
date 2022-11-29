package day24_CustomMethod_Return;

import java.util.Arrays;

public class PrintMultipleWords {
    public static void main(String[] args) {
       String str="knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";
       String[] str1=str.split(", ");
        System.out.println(Arrays.toString(str1));
        for (int i = 0; i < str1.length; i++) {
            if (str1[i].contains(" "))
                System.out.println(str1[i]);

        }
        for (String s : str1) {
            if (s.contains(" "))
            System.out.println(s);
        }
    }

}
