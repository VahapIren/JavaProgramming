package day35_Encapsulation.restaurant;

public class LocalRestaurant {
    public static void main(String[] args) {

        Restaurant restaurant1=new Restaurant("Vahap","Istanbul",5);

        Server server1=new Server("Ali",123,45,true);
        Server server2=new Server("Ayse",124,45,true);
        Server server3=new Server("Ahmet",125,50,false);
        Server[] servers={server1,server2,server3};
        restaurant1.hireServer(server1);
        System.out.println(restaurant1);

        System.out.println("----------------------");

        restaurant1.hireServer(servers);

        System.out.println(restaurant1);

        System.out.println("----------------------");

        Chef chef1=new Chef("Ali",126,45,true);
        Chef chef2=new Chef("Ayse",127,45,true);
        Chef chef3=new Chef("Ahmet",128,50,false);
        Chef[] chefs={chef1,chef2,chef3};
        restaurant1.hireChef(chef1);
        System.out.println(restaurant1);

        System.out.println("----------------------");

        restaurant1.hireChef(chefs);
        System.out.println(restaurant1);

    }
}
