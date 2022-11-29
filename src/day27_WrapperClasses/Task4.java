package day27_WrapperClasses;

public class Task4 {
    public static void main(String[] args) {

        String str = "JAVA java";
        int countUpper=0,countLower=0;

        for (char each : str.toCharArray()) {
            if (Character.isUpperCase(each))
                countUpper++;

            if(Character.isLowerCase(each))
                countLower++;
        }
        boolean result=countLower==countUpper;
        System.out.println(result);

    }
}
