package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class LargestNumber {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,7,8,8));
        int n=5;
        for (int i = 1; i < n; i++) {
        list.removeIf(p->p== Collections.max(list));
            System.out.println(list);
        }
        System.out.println(Collections.max(list));
    }
}
