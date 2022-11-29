package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        int min =list.get(0);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)< min)
                min =list.get(i);
        }
        System.out.println("min = " + min);
    }
}
