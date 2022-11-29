package day06_PrimitiveTypeCastings;

public class PrimitiveCasting {
    public static void main(String[] args) {
        byte a=25;
        short b=a;
        //short b=(short)a;
        //implicit casting

        int c=b;
        //int c=(int)b;IMPLICITY
        //implicit casting==>smaller primitives can be directly assigned to larger primitive type
        //explicit casting==>larger primitives can NOT be directly assigned to smaller primitive types(need to be done manually)

        long d=c;
        //long d=(long)c;
        float e=d;
        double f=e;
        System.out.println("---------------------------------------------------" );


        int x=55;
        short y=(short)x;//explicit casting
        System.out.println(x+" : "+y);

        long z=35000;
        short t=(short) z;
        System.out.println(z+" : "+t);

        double l=2.5;
        float m=(float)l;
        System.out.println(l+" : "+m);

        double n=10.8;
        int s=(int) n;          //10
        System.out.println(n+" : "+s);
        System.out.println("---------------------------------------------------" );

        double d1=20.5;
        short s1= (short) d1;

        float f1=30.5F;
        long l1= (long) f1;


    }
}
