package day16_ForLoopStringPractice;

public class DigitLettersSpecialCharacters {
    public static void main(String[] args) {
        String str="Cydeo123450000School!@#$%&WoodenSpoon";
        String digits="";
        String letters="";
        String specialCharacters="";
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            System.out.print(ch+" ");
            if (ch>='0'&&ch<='9'){
                if (ch!='0') {
                    digits += ch;
                }
            } else if (ch>='a'&&ch<='z') {
                letters+=ch;
            } else if (ch>='A'&&ch<='Z') {
                letters+=ch;
            }else {
                if (ch != ' ') {
                    specialCharacters += ch;
                }
            }

        }
        System.out.println();
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialCharacters = " + specialCharacters);
    }
}
