package officeHours;

public class ForEachLoop {
    public static void main(String[] args) {

   one();
   two();
   three();




    }

    public static void three() {
        String[] names = {"Harold8000", "Jack3000", "Ahmet6000", "Sakushi7000"};
        int total=0;
        for (String name : names) {
            total+=Integer.valueOf(name.substring(name.length()-4));
        }
        System.out.println(total);
    }

    public static void one(){
        int[] num={1,2,3,4,5,6,7,8};
        for (int each : num) {
            System.out.println(each);
        }

    }
    public static void two(){
        String [] arrNames ={"Harold","Jack","Ahmet","Sakushi"};
        for (String each : arrNames) {
            System.out.println(each.toLowerCase()+"@gmail.com");
        }
    }

}
