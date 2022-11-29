package day24_CustomMethod_Return;

public class Task1_3 {
    public static void main(String[] args) {
        int[] numbers={23,34,54,12,654,11,-98,-723,0,45};
        int min=minNumber(numbers);
        System.out.println("Min NUmber is "+min);

    }
    public static int minNumber(int[] numbers){
        int min=numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]<min){
                min=numbers[i];
            }
        }
        return min;
    }

}
