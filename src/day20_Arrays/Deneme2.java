package day20_Arrays;

import java.util.Arrays;

public class Deneme2 {
    public static void main(String[] args) {
        int arr[] = {10, 4, 3, 50, 23, 90};
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
        System.out.println("---------------------");
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);


    }
}
