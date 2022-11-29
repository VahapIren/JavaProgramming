package day24_CustomMethod_Return;

public class HiddenSentence {
    public static void main(String[] args) {
        String sentence = "Y*78*8*o770987987u a869869=r????23425235e t54898)" +
                "!'^h^^&%e b+%^^e%&+s%&t g+%&%+u/%y&/s.&6756/D4o " +
                "n556576ot5675 c657467a7657r7657e a6575b6575o5675u567t i5467t&";
        String result="";
        for (int i = 0; i < sentence.length(); i++) {

            if ((sentence.charAt(i)>=65&&sentence.charAt(i)<=90)||(sentence.charAt(i)>=96&&sentence.charAt(i)<=122)||
                    (sentence.charAt(i)==32)){
                result+=sentence.charAt(i);
            } else if (sentence.charAt(i)=='.') {
                break;
            }
        }
        System.out.println(result);
    }
}
