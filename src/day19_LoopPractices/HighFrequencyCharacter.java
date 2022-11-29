package day19_LoopPractices;

public class HighFrequencyCharacter {
    public static void main(String[] args) {
        String str="aaabbaccbbcbb";
        String res="";
        int max=0;
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            int freq=0;
            for (int j = 0; j < str.length(); j++) {
                char each = str.charAt(j);
                if (ch == each) {
                    freq++;
                }
            }

                if (freq > max) {
                    max = freq;
                    res=""+ch;
                }

        }
        System.out.println(max+" times "+res);
    }
}
