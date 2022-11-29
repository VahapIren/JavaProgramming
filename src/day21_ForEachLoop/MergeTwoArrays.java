package day21_ForEachLoop;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {

        int[] arr1={1,2,3,4};
        int[] arr2={5,6};
        String[] group1={"Ali","Layan","Aysenur"};
        String[] group2={"Maria","Aygun","Duygu","Suat","Valeriy"};
        String [] students=new String[group2.length+group1.length];
        int i=0;
        for (String each : group1) {
            students[i++]=each;
        }
        for (String each : group2) {
            students[i++]=each;
        }
        System.out.println(Arrays.toString(students));

        char[] ch1={'A','B','C'};
        char[] ch2={'D','E','F','G','H'};
        char[] chars= new char[ch1.length+ch2.length];
        int j =0;

        for (char each : ch1) {
            chars[j++]=each;
        }
        for (char each : ch2) {
            chars[j++]=each;
        }
        System.out.println(Arrays.toString(chars));




    }
}
