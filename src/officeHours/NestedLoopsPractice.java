package officeHours;

public class NestedLoopsPractice {
    public static void main(String[] args) {

one();

    }

    public static void one(){
        for (int i = 1; i <11 ; i++) {
            for (int j = 1; j <11 ; j++) {
                System.out.print(j+"x"+i+"="+(i*j)+" ");
            }
            System.out.println();
        }

    }
}
