package day20_Arrays;

import java.util.Scanner;

public class ClassMates {
    public static void main(String[] args) {

       /* Scanner scan=new Scanner(System.in);
          String [] classMates=new String[10];
        System.out.println("enter the names");
        for (int i = 0; i < classMates.length; i++) {
            System.out.println("enter the names");
            classMates[i]=scan.nextLine();

        }
        System.out.println(Arrays.toString(classMates));
*/

        String [] classmates={"vahap","neslihan","betul","nihan","orhan"};
        for (int i = 0; i < classmates.length; i++) {
            String result="";
            for (int j = classmates[i].length()-1; j >=0 ; j--) {
                result+=""+classmates[i].charAt(j);
            }
            System.out.println(result);
        }




    }
}
