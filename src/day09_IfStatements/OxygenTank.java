package day09_IfStatements;

public class OxygenTank {
    public static void main(String[] args) {
        int tankLevel=45;
        if(tankLevel>=90){
            System.out.println("Your tank is FULL");
        } else if (tankLevel>=80) {
            System.out.println("Still OK");
        } else if (tankLevel>=70) {
            System.out.println("Don't go too far");
        } else if (tankLevel>=60) {
            System.out.println("Start to head back");
        }else if(tankLevel>=50){
            System.out.println("Be carefull you are at %50");
        }else{
            System.err.println("too low don't go");
        }



    }
}
