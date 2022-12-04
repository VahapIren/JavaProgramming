package day36_Inheritance.sport;

public class Basketball extends Sport{
    public static int time=60;
    public Basketball() {
        super("Basketball", 5, 3, "Foul,field goal ");
    }

    public String toString() {
        return "Basketball{" +
                "name='" + name + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfReferre=" + numberOfReferre +
                ", rules='" + rules + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
