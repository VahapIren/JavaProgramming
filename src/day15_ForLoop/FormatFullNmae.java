package day15_ForLoop;

public class FormatFullNmae {
    public static void main(String[] args) {
        String firstName="cyDEo",
                lasrName="SCHOOL";
       // firstName=firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
        firstName=(""+firstName.charAt(0)).toUpperCase()+firstName.substring(1).toLowerCase();
        System.out.println(firstName);
        lasrName=(""+lasrName.charAt(0)).toUpperCase()+lasrName.substring(1).toLowerCase();
        System.out.println(lasrName);
        System.out.println("full name:"+firstName+" "+lasrName);

    }
}
