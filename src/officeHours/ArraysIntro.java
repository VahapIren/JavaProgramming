package officeHours;

public class ArraysIntro {
    public static void main(String[] args) {

one();
two();
    }
    public static void one(){
        int[] numbers={1,2,3,4,5,6,7,89,9,10};
        int even=0,odd=0;
        for (int i = 0; i < numbers.length; i++) {
            if (i%2==0)
                even+=numbers[i];
            else
                odd+=numbers[i];
        }
        System.out.println(even);
        System.out.println(odd);
    }
    public static void two(){
        int[] numbers={1,2,3,4,5,6,7,89,9,10};
        for (int i = numbers.length-1; i >=0 ; i++) {

        }
    }




}
