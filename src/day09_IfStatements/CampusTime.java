package day09_IfStatements;

public class CampusTime {
    public static void main(String[] args) {
        int time=7;
        if(time>=8&&time<=23){
            System.out.println("Campus is OPEN");
        }else {
            System.out.println("Campus is CLOSED");
        }
    }
}
