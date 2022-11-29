package day24_CustomMethod_Return;

public class ChangeWords {
    public static void main(String[] args) {
        String message = "I love cats! I have a cat named Coco. My cat's very smart!";
        String word="dog";
        System.out.println(changeTheMessage(message, word));
    }

    public static String changeTheMessage(String message, String word) {
        String result=message.replaceAll("cat","dog");
        return result;
    }

}
