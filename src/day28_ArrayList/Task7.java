package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,2,3,4,4,5,6,7,7));

        for (Integer each : list) {
            int count=0;
            for (Integer each2 : list) {
                if (each==each2)
                    count++;
            }
            if (count>1){
                System.out.println(each);
                break;
            }
        }


    }
}
