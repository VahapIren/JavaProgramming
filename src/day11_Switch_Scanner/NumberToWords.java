package day11_Switch_Scanner;

public class NumberToWords {
    public static void main(String[] args) {
        int number=1;
        String result="";

            result=(number>=0&&number<=9)?(number==1)?"ONE":(number==2)?"TWO":(number==3)?"THREE":(number==4)?"FOUR":(number==5)?"FIVE":(number==6)?"SIX"
                    :(number==7)?"SEVEN":(number==8)?"EIGHT":(number==9)?"NINE":"ZERO":"Invalid Number";

            System.out.println(result);
    }
}
