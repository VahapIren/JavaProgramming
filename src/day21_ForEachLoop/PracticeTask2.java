package day21_ForEachLoop;

public class PracticeTask2 {
    public static void main(String[] args) {

        int[] numbers={1,2,3,4,56,7,8,99,60,34,56,76,77,89};
        int even=0,odd=0;
        for (int each : numbers) {
            if (each%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("total even numbers: "+even);
        System.out.println("total odd numbers: "+odd);


    }
}
