package day21_ForEachLoop;

public class PractiveTask6 {
    public static void main(String[] args) {

        String[] str={"total", "number", "python","of", "java", "and","python", "find", "java", "in", "the","python", "sentance", "java"};
        int count=0,frequency=0;
        for (String each : str) {

            if (each.equals("java")){
                count++;
            }
            if (each.equals("python")){
                frequency++;
            }

        }
        System.out.println("count = " + count);
        System.out.println("frequency = " + frequency);


    }
}
