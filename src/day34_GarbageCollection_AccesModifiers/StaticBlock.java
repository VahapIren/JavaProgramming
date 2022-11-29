package day34_GarbageCollection_AccesModifiers;

public class StaticBlock {
    public static void main(String[] args) {
        System.out.println("main method");

    }
    static {   //first static block run but only one time
        System.out.println("static block");
    }
    static {   //first static block run but only one time
        System.out.println("static block2");
    }
    static {   //first static block run but only one time
        System.out.println("static block3");
    }
}
