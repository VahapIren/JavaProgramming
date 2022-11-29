package day15_ForLoop;

public class Task1 {
    public static void main(String[] args) {
        int sum=0,summ=0;
        for (int i = 0; i <= 100; i+=2) {
            sum+=i;
        }
        System.out.println(sum);

        for (int i = 0; i <= 100; i++) {
            if (i%2==0)
                summ+=i;
        }
        System.out.println(summ);
    }
}
