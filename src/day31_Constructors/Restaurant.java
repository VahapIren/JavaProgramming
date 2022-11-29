package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {
    public String owner,location;
    public int numbersOfStars;
    public ArrayList<Server > servers=new ArrayList<>();
    public ArrayList<Chef > chefs=new ArrayList<>();

    public Restaurant(String owner, String location, int numbersOfStars) {
        this.owner = owner;
        this.location = location;
        this.numbersOfStars = numbersOfStars;
    }

    public void hireServer(Server server){
        servers.add(server);
    }
    public void hireServer(Server[] server){
        servers.addAll(Arrays.asList(server));
    }
    public void hireChef(Chef chef){
        chefs.add(chef);
    }
    public void hireChef(Chef[] chef){
        chefs.addAll(Arrays.asList(chef));
    }
    public void terminateChef(int employeeID){
        chefs.removeIf(p->p.employeeID==employeeID);
    }
    public void terminateServer(int employeID){
        servers.removeIf(p -> p.employeeID == employeID);

    }


    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numbers Of Stars=" + numbersOfStars +
                ", numbers Of Servers=" + servers.size() +
                ", numbers Of Chefs=" + chefs.size() +
                '}';
    }
}
