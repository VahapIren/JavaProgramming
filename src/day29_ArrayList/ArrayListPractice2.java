package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.SplittableRandom;

public class ArrayListPractice2 {
    public static void main(String[] args) {

        ArrayList<String > employees=new ArrayList<>();
        employees.addAll(Arrays.asList("Ali","David","Ahmet","Jimmy","Daniel","Aaoran","Ahmet","David","Shay"));
        employees.retainAll(Arrays.asList("Ahmet","David"));
        System.out.println(employees);
        System.out.println("------------------------------------------------------");

        String[] names={"Mary","Monica","Mehray","Musti","Sumeyra","Hasan","Beril"};
        ArrayList<String > nameList=new ArrayList<>(Arrays.asList(names));
        System.out.println(nameList);

        nameList.removeIf(p->!(p.charAt(0)=='M'));
        names=nameList.toArray(new String[0]);



        System.out.println(Arrays.toString(names));

    }


}
