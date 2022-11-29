package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {

        int[] nums={1,2,3,34,5};
        System.out.println(nums);//hashcodedd
        System.out.println(Arrays.toString(nums));
        System.out.println(nums[1]);
        String str="Java";
        System.out.println(str);
        System.out.println(str.toString());
        System.out.println("-----------------------");
        int[] scores={95,100,38,84,46,69};
        System.out.println(Arrays.toString(scores));
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));
        System.out.println("min:"+scores[0]);
        System.out.println("max:"+scores[scores.length-1]);

        String[] names={"Gunay","Anna","Zulal","Ahmet","Sinem"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        String [] words={"Anna","ANNA"};
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

        int[] arr1={1,3,2};
        int[] arr2={1,2,3};
        boolean r1=Arrays.equals(arr1,arr2);
        System.out.println(r1);
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1,arr2));
        System.out.println("----------------------------");

        char[] ch1={'a','c','b'};
        char[] ch2={'b','a','c'};
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean anagram=Arrays.equals(ch1,ch2);
        System.out.println(anagram);
        System.out.println("-------------------------------");






    }
}
