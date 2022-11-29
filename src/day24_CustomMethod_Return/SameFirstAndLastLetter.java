package day24_CustomMethod_Return;

import java.util.Scanner;

public class SameFirstAndLastLetter {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int size=in.nextInt();
        String [] arr1=new String[size];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=in.next();
        }
        System.out.println(firstLastSameLetter(arr1));
    }
    public static int firstLastSameLetter(String[] arr1){
        int count=0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i].charAt(0)==arr1[i].charAt(arr1[i].length()-1))
                count++;
        }
        return count;
    }

}
