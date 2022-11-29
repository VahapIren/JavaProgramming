package day15_ForLoop;

public class Task2 {
    public static void main(String[] args) {
        int sum=0,summ=0;
        for (int i = 1; i <100 ; i+=2) {
            sum+=i;
        }
        System.out.println(sum);

        for (int i = 0; i < 100; i++) {
            if (i%2==1)
                summ+=i;
        }
        System.out.println(summ);
    }
}
