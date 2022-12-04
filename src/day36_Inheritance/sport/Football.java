package day36_Inheritance.sport;

public class Football extends Sport{
    public static int time=90;
    public Football() {
        super("Football", 11, 5, "Penalty,Offside,Corner");
    }

    @Override
    public String toString() {
        return "Football{" +
                "name='" + name + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfReferre=" + numberOfReferre +
                ", rules='" + rules + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
