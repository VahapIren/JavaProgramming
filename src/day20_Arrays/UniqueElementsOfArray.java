package day20_Arrays;

public class UniqueElementsOfArray {
    public static void main(String[] args) {

        String [] words={"java","java","c","python","python","c","adam","olga"};

        for (int i = 0; i < words.length; i++) {


            String element = words[i];
            int count = 0;
            for (int j = 0; j < words.length; j++) {
                if (words[j].equals(element)) {
                    count++;
                }

            }
            if (count==1){
                System.out.println(element);
            }
        }

        for (String word : words) {
            int fre=0;
            for (String s : words) {
                if (word.equals(s))
                    fre++;
            }
            if (fre==1)
                System.out.print(word+" ");
        }

    }
}
