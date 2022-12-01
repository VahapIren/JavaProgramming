package day35_Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {
    public static void main(String[] args) {


    ArrayList<Candy> candies=new ArrayList<>();
       Candy candy1=new Candy("Melon",5,0,true);
       Candy candy2=new Candy("Grape",3,2,false);
       Candy candy3=new Candy("banana",4,8,true);
       Candy candy4=new Candy("Apple",6,12,false);
       Candy candy5=new Candy("Peach",2,5,true);

       candies.addAll(Arrays.asList(candy1,candy2,candy3,candy4,candy5));
        for (Candy candy : candies) {
            System.out.println(candy.getBrand()+" : "+candy.getPrice());
        }
        System.out.println(candy1);
    }
}
