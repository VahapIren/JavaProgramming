package day24_CustomMethod_Return;

public class Task5 {
    public static void main(String[] args) {

        int[] array ={1,1,1,1,1,2,2};
        System.out.println(frequency(array,1));;
        System.out.println("ferq(array,2) = " + ferq(array, 2));

    }
    public static int frequency(int[] arr,int num){
        int freq=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==num){
                freq++;
            }
        }
        return freq;
    }
    public static int ferq(int[] arr,int num){
        int fre=0;
        for (int each : arr) {
            if (each==num)
                fre++;
        }
        return fre;
    }

}
