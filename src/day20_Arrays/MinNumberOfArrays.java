package day20_Arrays;

public class MinNumberOfArrays {
    public static void main(String[] args) {

        int[] numbers={1,2,3,4,5,6};
        int min=numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]<min){
                min=numbers[i];
            }
        }
        System.out.println(min);

    }
}
