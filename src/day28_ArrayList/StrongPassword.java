package day28_ArrayList;

public class StrongPassword {
    public static void main(String[] args) {



        String password="Cydeo1990@";


        System.out.println("isStrongPassword = " + isStrongPassword(password));

    }
    public  static boolean isStrongPassword(String password){
        boolean r1=password.length()>=8&&!password.contains(" ");
        boolean r2=false;
        boolean r3=false;
        boolean r4=false;
        boolean r5=false;

        char[] chars=password.toCharArray();
        for (char each : chars) {
            if (Character.isUpperCase(each)){
                r2=true;
            }else if (Character.isLowerCase(each)){
                r3=true;
            }else if (Character.isDigit(each)){
                r5=true;
            }else {
                r4=true;
            }
        }
        boolean isStrongPassword=r1&&r2&&r3&&r4&&r5;

        return isStrongPassword;
    }
}
