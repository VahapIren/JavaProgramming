package day14_String;

public class EmailDomain {
    public static void main(String[] args) {
        String email="vahapiren@gmail.com";
        String domain=email.substring(email.indexOf("@")+1,email.indexOf("."));
        System.out.println("domain = " + domain);
        System.out.println("---------------------------------");
        String str1="Java is fun, Java is cool, I love Java";
        String s1=str1.substring(0,10+1);
        int beg=str1.indexOf(" J");
        int end=str1.lastIndexOf(",");
        String s2=str1.substring(beg+1,end);
        String s3=str1.substring(str1.lastIndexOf("I"));
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);



    }
}
