package day15_ForLoop;

public class StringNumbersSum {
    public static void main(String[] args) {

        String str="A3B2C4";
        char ch='0';
        int sum=0;
        for (int i = 0; i < str.length(); i++) {
            ch=str.charAt(i);
            if (ch>='0'&&ch<='9'){
                sum+=ch-48; //According to ASCII table digit char value is more than 48 from the digit orginal value
            }


        }
        System.out.println(sum);

    }
}
