package day35_Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class ItemObject {
    public static void main(String[] args) {

        Item item1=new Item("Apple",3.5,8);
        Item item2=new Item("Banana",5.5,4);
        Item item3=new Item("Grape",2.5,5);
        Item item4=new Item("Peach",4.5,6);

        ArrayList<Item> list=new ArrayList<>();
        list.addAll(Arrays.asList(item1,item2,item3,item4));

        System.out.println("item1 = " + item1);
        item1.setName("toilet paper");
        System.out.println(item1);
        item1.setQuantity(1);
        System.out.println(item1.getQuantity());
        item1.setName("Tomato juice");
        System.out.println("item1.getName() = " + item1.getName());
        System.out.println("item1.calcCost() = " + item1.calcCost());
        double totalCost=0;
        for (Item item : list) {

            totalCost+=item.calcCost();
        }
        System.out.println(totalCost);
    }
}
