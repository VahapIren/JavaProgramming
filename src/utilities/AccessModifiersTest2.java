package utilities;

import day34_GarbageCollection_AccesModifiers.AccessModifiers;

public class AccessModifiersTest2 {
    public static void main(String[] args) {

        AccessModifiers.method1();
        //AccessModifiers.method2();  default is not visible outside the package
        //AccessModifiers.method3();  private is not visible outside the package

    }
}
