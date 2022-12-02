package day31_Constructors.restaurant;

public class LocalRestaurant {
    public static void main(String[] args) {

        Restaurant rest1=new Restaurant("Vahap","Istanbul",5);

        Server server1=new Server("Ali",123,45,true);
        Server server2=new Server("Ayse",124,45,true);
        Server server3=new Server("Ahmet",125,50,false);
        Server[] server={server1,server2,server3};
        rest1.hireServer(server);

        Chef chef1=new Chef("Ali",126,45,true);
        Chef chef2=new Chef("Ayse",127,45,true);
        Chef chef3=new Chef("Ahmet",128,50,false);
        Chef[] chef={chef1,chef2,chef3};
        rest1.hireChef(chef);

        System.out.println(rest1.toString());
        System.out.println("-------------------------------");

        rest1.terminateChef(125);

        System.out.println(rest1.toString());
        System.out.println("-------------------------------");

        rest1.hireChef(chef3);

        System.out.println(rest1.toString());

        rest1.terminateChef(128);
        System.out.println(rest1);

        System.out.println("server3.employeeID = " + server3.employeeID);
        server3.cleanTable();

        chef2.makeOrder();

        System.out.println(server1);
        System.out.println(chef1);


    }
}
