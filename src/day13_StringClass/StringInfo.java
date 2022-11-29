package day13_StringClass;

public class StringInfo {
    public static void main(String[] args) {
        String name="wooden Spoon";
        String name2="wooden Spoon";
        String name3="wooden Spoon";
        String name4="wooden Spoon";
        System.out.println(name==name2);
        System.out.println(name3==name2);
        System.out.println(name3==name4);
        String str1=new String("Wooden Spoon");
        String str2=new String("Wooden Spoon");
        String str3=new String("Wooden Spoon");
        String str4=new String("Wooden Spoon");
        System.out.println(str1==str2);
        System.out.println(str3==str2);
        System.out.println(str3==str4);
        System.out.println("--------------------------------");
        String s1="Java";
        String s2=new String("Java");
        System.out.println(s1.equals(s2));


    }
}
