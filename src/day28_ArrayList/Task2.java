package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        int first=list.get(0);
        int last=list.get(list.size()-1);
        list.set(0,last);
        list.set(list.size()-1,first);
        System.out.println(list);


    }
}
