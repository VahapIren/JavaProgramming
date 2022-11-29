package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {
    public static void main(String[] args) {

    String str="aaabcccdeeefggggiiijkklllllooıoıı";
    String [] arr=str.split("");
        ArrayList<String > list=new ArrayList<>(Arrays.asList(arr));
        System.out.println("list = " + list);

        String unique="";
        for (String each : list) {
            int freq=Collections.frequency(list,each);
            if (freq==1){
                unique+=each;
            }
        }
        System.out.println("unique = " + unique);
        ArrayList<String > list2=new ArrayList<>(Arrays.asList(arr));
        list2.removeIf(p->Collections.frequency(list2,p)>1);
        String v="";
        for (String s : list2) {
            v+=s;
        }
        System.out.println(v);
        System.out.println(list2);
    }


}
