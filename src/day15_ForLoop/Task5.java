package day15_ForLoop;

public class Task5 {
    public static void main(String[] args) {
        String str="mn@#123Ab!";
        String letter="",digit="",special="";
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if ((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
                letter+=""+ch;
            } else if (ch>='0'&&ch<='9') {
                digit+=""+ch;
            }else {
                special+=""+ch;
            }

        }
        System.out.println("letters: "+letter);
        System.out.println("digit = " + digit);
        System.out.println("special = " + special);


    }
}
