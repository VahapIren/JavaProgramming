package day18_NestedLoop;

public class NestedLoop {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.print("WoodenSpoon ");

        }
        for (int i = 0; i < 5; i++) {
            System.out.print("WoodenSpoon ");
        }
        for (int i = 0; i < 5; i++) {
            System.out.print("WoodenSpoon ");
        }
        System.out.println();
        System.out.println("---------------------------------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("WoodS ");
            }
        }
    }
}
