package day20_Arrays;

import java.util.Arrays;

public class Deneme3 {
    public static void main(String[] args) {

        int arr[] = {0, 4, 0, 7, 0, 5, 8,0,6};
        for (int i=0;i<arr.length-1;i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j]==0){
                    arr[j]=arr[j+1];
                    arr[j+1]=0;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
