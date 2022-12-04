package day36_Inheritance.sport;

public class Sport {
    protected String name;
    protected int numberOfPlayers,numberOfReferre;
    protected String rules;

    public Sport(String name, int numberOfPlayers, int numberOfReferre,String rules) {
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
        this.numberOfReferre = numberOfReferre;
        this.rules=rules;
    }
    public void play(){
        System.out.println("he is playing "+name);
    }
    public String toString() {
        return "Sport{" +
                "name='" + name + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfReferre=" + numberOfReferre +
                ", rules='" + rules + '\'' +
                '}';
    }
}
