package day35_Encapsulation.restaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {
    private String owner,location;
    private int numbersOfStars;
    private ArrayList<Server> servers=new ArrayList<>();
    private ArrayList<Chef> chefs=new ArrayList<>();

    public Restaurant(String owner, String location, int numbersOfStars) {
        setOwner(owner);
        setLocation(location);
        setNumbersOfStars(numbersOfStars);
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumbersOfStars() {
        return numbersOfStars;
    }

    public void setNumbersOfStars(int numbersOfStars) {
        if (numbersOfStars>5)
            return;
        this.numbersOfStars = numbersOfStars;
    }

    public ArrayList<Server> getServers() {
        return servers;
    }

    public void setServers(ArrayList<Server> servers) {
        this.servers = servers;
    }

    public ArrayList<Chef> getChefs() {
        return chefs;
    }

    public void setChefs(ArrayList<Chef> chefs) {
        this.chefs = chefs;
    }

    public void hireServer(Server server){
        for (Server server1 : servers) {
            if (server1.getEmployeeID()==server.getEmployeeID()){
                System.out.println("Employee ID "+server1.getEmployeeID()+" is already exist please change Employee ID");
                return;
            }
        }
        servers.add(server);
    }
    public void hireServer(Server[] server){
        for (Server server1 : servers) {
            for (int i = 0; i < server.length; i++) {
                if (server1.getEmployeeID()==server[i].getEmployeeID()){
                    System.out.println("Employee ID "+server1.getEmployeeID()+" is already exist please change Employee ID");
                    return;
                }

            }
        }
        servers.addAll(Arrays.asList(server));
    }
    public void hireChef(Chef chef){
        for (Chef chef1 : chefs) {
            if (chef1.getEmployeeID()==chef.getEmployeeID())
                return;
        }
        chefs.add(chef);
    }
    public void hireChef(Chef[] chef){
        for (Chef chef1 : chefs) {
            for (int i = 0; i < chef.length; i++) {
                if (chef1.getEmployeeID()==chef[i].getEmployeeID()){
                    System.out.println("Employee ID "+chef1.getEmployeeID()+" is already exist please change Employee ID");
                    return;
                }
            }
        }
        chefs.addAll(Arrays.asList(chef));
    }
    public void terminateChef(int employeeID){
        chefs.removeIf(p->p.getEmployeeID()==employeeID);
    }
    public void terminateServer(int employeID){
        servers.removeIf(p -> p.getEmployeeID() == employeID);

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
