package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,1,3,4,3,5,5,6,7,8,7,9,9));

        ArrayList<Integer> unique=new ArrayList<>();
        for (Integer each : list) {
            int freq=Collections.frequency(list,each);
            if (freq==1){
                unique.add(each);
            }
        }
        System.out.println(unique);
        System.out.println("--------------------------------------------------");
        ArrayList<Integer> list2=new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,1,3,4,3,5,5,6,7,8,7,9,9));

        ArrayList<Integer> unique2=new ArrayList<>(list2);
        list2.removeIf(p->Collections.frequency(list2,p)>1);
        System.out.println(list2);


    }
}
