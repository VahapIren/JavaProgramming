package day34_GarbageCollection_AccesModifiers;

public class Constructor_Vs_StaticBlock {
    static {
        System.out.println("static block");
    }
    public Constructor_Vs_StaticBlock(){//only execute when object created
        System.out.println("Contructor");
    }

    public static void main(String[] args) {
        new Constructor_Vs_StaticBlock();
        new Constructor_Vs_StaticBlock();
        new Constructor_Vs_StaticBlock();
        new Constructor_Vs_StaticBlock();
        new Constructor_Vs_StaticBlock();

        System.out.println("Main method");
    }
}
