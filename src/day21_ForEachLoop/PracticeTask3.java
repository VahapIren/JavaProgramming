package day21_ForEachLoop;

public class PracticeTask3 {
    public static void main(String[] args) {

        int[] arr1= {1,2,3,4,5};
        int[] arr2= {4,5,6,7,8,9};


        for (int each : arr1) {
            for (int ch : arr2) {
                if (each==ch){
                    System.out.print(each+" ");
                }
            }
        }



    }
}
