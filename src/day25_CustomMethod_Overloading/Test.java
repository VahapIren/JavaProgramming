package day25_CustomMethod_Overloading;

import utilities.StringUtility;

public class Test {
    public static void main(String[] args) {
        String str="Java Programming Language";
        StringUtility.printEachCharacter(str);
        System.out.println("-------------------------");

        String str1="Wooden Spoon";
        System.out.print(StringUtility.reverse(str1));
        System.out.println();
        System.out.println("---------------------------");

        String str2="level";
        boolean palindrome=StringUtility.isPalindrom(str2);
        System.out.println(palindrome);
        System.out.println("-------------------------------");
        String[] names={"Anna","Java","Python","racecar","Mom","Cydeo"};
        int count=0;
        for (String each : names) {
            if (StringUtility.isPalindrom(each))
                count++;
        }
        System.out.println(count);
        System.out.println("----------------------------------");

        String str3="aadrdrfsrfedsassdfrtfgfgtgftfdser";
        System.out.println(StringUtility.removeDuplicates(str3));
        System.out.println("------------------------");

    }
}
