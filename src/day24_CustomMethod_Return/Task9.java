package day24_CustomMethod_Return;

public class Task9 {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};
        int num=4;
        System.out.println(isContain(arr,num));
    }
    public static boolean isContain(int[] arr,int num){
        boolean result=false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==num){
                result=true;
            }
        }
        return result;
    }


}
