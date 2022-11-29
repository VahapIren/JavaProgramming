package day27_WrapperClasses;

public class Task3 {
    public static void main(String[] args) {

        String str = "Wooden Spoon125!";
        String letters="", digits ="",specialChars="";

        for (char each : str.toCharArray()) {
            if (Character.isLetter(each))
                letters+=each;
            else if (Character.isDigit(each))
                digits +=each;
            else
                specialChars+=each;
        }

        System.out.println("letters= \""+letters+"\"");
        System.out.println("Digits= \""+ digits+"\"");
        System.out.println("specialChars = \"" + specialChars+"\"");
    }

}
