package day28_ArrayList;

public class StrongPassword2 {
    public static void main(String[] args) {

    String passsword="Cydeo1990@";
    int countUpperCase=0;
    int countLowerCase=0;
    int countDigits=0;
    int countSpecialChar=0;
        for (int i = 0; i < passsword.length(); i++) {
            char each=passsword.charAt(i);
            if (Character.isUpperCase(each)){
                countUpperCase++;
            } else if (Character.isLowerCase(each)) {
                countLowerCase++;
            } else if (Character.isDigit(each)) {
                countDigits++;
            }else {
                countSpecialChar++;
            }
        }
        System.out.println("countLowerCase = " + countLowerCase);
        System.out.println("countUpperCase = " + countUpperCase);
        System.out.println("countDigits = " + countDigits);
        System.out.println("countSpecialChar = " + countSpecialChar);

        boolean hasUpperCase=countUpperCase>0;
        boolean hasLowerCase=countLowerCase>0;
        boolean hasDigit=countDigits>0;
        boolean hasSpecials=countSpecialChar>0;

        boolean strongPassword=passsword.length()>=8&&!passsword.contains(" ")&&hasUpperCase&&hasDigit&&hasLowerCase&&hasSpecials;
        System.out.println("strongPassword = " + strongPassword);
    }


}
