package day24_CustomMethod_Return;

import java.io.FilterOutputStream;
import java.util.Arrays;

public class CountEachName {
    public static void main(String[] args) {
        String names = "Adam Adam Barry Aysun Aysun";
        String [] name1=names.split(" ");
        String result="";
        System.out.println(Arrays.toString(name1));
        for (int i = 0; i < name1.length; i++) {
            int count=0;
            for (String each:name1){
                if (name1[i].equals(each)){
                    count++;
                }

            }
            if (!result.contains(name1[i]))
            result+=name1[i]+"-"+count+" ";
        }
        System.out.println(result);
    }
}
