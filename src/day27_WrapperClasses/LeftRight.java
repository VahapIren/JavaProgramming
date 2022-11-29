package day27_WrapperClasses;

public class LeftRight {
    public static void main(String[] args) {

        int[] numbers={4, 9, 1, 3, 6, 4,4,9};


        for (int i = 1; i <numbers.length-1 ; i++) {
            int left=0,right=0;
            for (int j = 0; j < i; j++) {
                left+=numbers[j];
            }
            for (int j = i+1; j <numbers.length ; j++) {
                right+=numbers[j];
            }
            if (left==right)
                System.out.println(i);
        }

    }
}
