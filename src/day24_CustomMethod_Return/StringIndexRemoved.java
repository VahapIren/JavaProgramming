package day24_CustomMethod_Return;

public class StringIndexRemoved {
    public static void main(String[] args) {
        String word="Adammeliedi";
        int index=7;
        System.out.println(indexRemover(word, index));

    }

    public static String indexRemover(String word, int index) {
        if (index>=0&&index<word.length()){
            word=word.substring(0,index)+word.substring(index+1);

        }
        return word;
    }

}
