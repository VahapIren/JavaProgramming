package day25_CustomMethod_Overloading;
import java.util.Arrays;
public class Deneme_Serkan {
    public static void main(String[] args) {
        int[] inhabitants = {3, 6, 0, 4, 3, 2, 7, 0};

        int[] expectedResult = new int[inhabitants.length];
        int d = 0;
        do {
            System.out.println("Day " + d + " " + Arrays.toString(inhabitants));
            d++;
            for (int i = 0; i < inhabitants.length; i++) {
                 if (i == 0) {
                    if (inhabitants[i + 1] == 0) {
                        inhabitants[i] = inhabitants[i] / 2;
                    }
                } else if (i == inhabitants.length - 1) {
                    if (inhabitants[i - 1] == 0) {
                        inhabitants[i] = inhabitants[i] / 2;

                    }
                }else if (i > 0 && i < inhabitants.length - 1) {
                     if (inhabitants[i + 1] < 1 || inhabitants[i - 1] < 1) {
                         inhabitants[i] = inhabitants[i] / 2;


                     }
                 }
            }
        } while (!(Arrays.equals(inhabitants, expectedResult)));
        {
            System.out.println("Day " + d + " " + Arrays.toString(inhabitants));
            System.out.println("---- EXTINCT ----");
        }
    }
}
