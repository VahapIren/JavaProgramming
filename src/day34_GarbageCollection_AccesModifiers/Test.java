package day34_GarbageCollection_AccesModifiers;
import static day34_GarbageCollection_AccesModifiers.Circle.*;
import static utilities.MathUtility.*;
public class Test {
    public static void main(String[] args) {
        System.out.println(Circle.pi);
        System.out.println(Circle.name);
        System.out.println(Circle.numbers);

        //WE can call static variables without classname
        System.out.println(pi);
        System.out.println(name);
        System.out.println(numbers);
        System.out.println("-------------------------------");

        int r1=sum(10,20);

        int r2=sum(100,200);

        int r3=substraction(100,50);

        int r4=maxNumber(1000,2000);


    }
}
