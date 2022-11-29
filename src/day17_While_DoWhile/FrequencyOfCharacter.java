package day17_While_DoWhile;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        String str="AAABBBCCACCCCCAAAAAAAAAA";
        char ch='C';
        char ch1='A';

        int frequency=0;
        int acc=0;

        for (int i = 0; i < str.length(); i++) {
            char eachChar=str.charAt(i);
            if (ch==eachChar){
                frequency+=1;
            }
            if (ch1==eachChar){
                acc++;
            }
        }
        System.out.println(frequency);
        System.out.println(acc);


    }
}
