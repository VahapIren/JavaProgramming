package day14_String;

public class StringMethod4 {
    public static void main(String[] args) {
        String str="Cydeo ";
        String str2=str.repeat(4);
        System.out.println(str2);

        String s1="Wooden Spoon";
        String s2=s1.repeat(10);
        System.out.println(s2);
        String s3=s1.substring(s1.charAt('W'));
        System.out.println(s3);
        System.out.println("-----------------------");

        System.out.println("Fady \t".repeat(11));
    }
}
