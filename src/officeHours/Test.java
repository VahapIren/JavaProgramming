package officeHours;

public class Test {
    public static void main(String[] args) {

        practice1();
        practice2();



    }
    public static void practice1() {
        for (int i = 0; i < 5; i++) {
            System.out.println(" ".repeat(9 - i * 2 + 1) + String.valueOf(i + 1).repeat(i * 2 + 1));
            System.out.println(9 - i * 2 + 1);
        }
    }
    public static void practice2(){
        String str="home",reverse="";
        for (int i = str.length()-1; i >=0; i--) {
            reverse+=str.charAt(i);
        }
        System.out.println(reverse);
    }
}
