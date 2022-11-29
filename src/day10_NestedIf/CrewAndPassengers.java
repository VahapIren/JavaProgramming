package day10_NestedIf;

public class CrewAndPassengers {
    public static void main(String[] args) {
        int number=101;
        int total,crew,passenger;
        if((number==50)||(number==75)||(number==100)){
            if(number==50){
               crew=20;
               passenger=30;
            } else if (number==75) {
                crew=25;
                passenger=50;
            }else {
                crew=30;
                passenger=70;
            }
            System.out.println("Total: "+(crew+passenger)+" ===> "+crew+" crew, "+passenger+" passengers");

        }else {
            System.out.println("Invalid");
        }
    }
}
