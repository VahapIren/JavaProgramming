package day24_CustomMethod_Return;

public class ReturnMethodIntro {
    public static void main(String[] args) {

        String str="qeneq" ;
        String result=reverse(str);
        System.out.println(result);
        if (str.equalsIgnoreCase(result)){
            System.out.println("palindrom");
        }else{
            System.out.println("not palindrom");
        }


    }
    public static String reverse(String str){
        String result="";
        for (int i = str.length()-1; i >=0; i--) {
            result+=str.charAt(i);
        }
        return result;
    }
}
