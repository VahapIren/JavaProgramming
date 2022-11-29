package day21_ForEachLoop;

public class ForEachLoop {
    public static void main(String[] args) {

        String [] names={"Cydeo School","Wooden Spoon","Java Programming","SQL Programming","Selenium Automation",
        "API Testing","Dtabase Testing","Manual Testing"};

        for (String each : names) {
            String initial=each.charAt(0)+" "+each.charAt(each.indexOf(" ")+1);
            System.out.println(initial);
        }


    }
}
