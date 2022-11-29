package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {

        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};

        ArrayList<String > list=new ArrayList<>();

        for (String each : arr1) {
            list.add(each);
        }
        for (String each : arr2) {
            list.add(each);
        }

        System.out.println(list);

        System.out.println("------------------------------------------");
        list.addAll(Arrays.asList(arr1));
        list.addAll(Arrays.asList(arr2));
        System.out.println(list);
    }
}
