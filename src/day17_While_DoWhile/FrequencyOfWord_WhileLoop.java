package day17_While_DoWhile;

public class FrequencyOfWord_WhileLoop {
    public static void main(String[] args) {

        String str="JavaJavaJava";
        int fre=0;

        while (str.contains("Java")){
            str=str.replaceFirst("Java","");
            fre+=1;
        }
        System.out.println(fre);
        System.out.println("---------------------");
        String sent="cat cat cat dog dog cat dog cat";
        int count=0;

        while (sent.contains("cat")){
            sent=sent.replaceFirst("cat","");
            count++;
        }
        System.out.println(count);
        System.out.println("---------------------------");

        String s="java java java python python python";
        int countJava=0;
        int countPython=0;
        while (s.contains("java")||s.contains("python")){
            if (s.contains("java")){
                s=s.replaceFirst("java","");
                countJava++;
            }
            if (s.contains("python")){
                s=s.replaceFirst("python","");
                countPython++;
            }
        }
        System.out.println(countJava+" "+countPython);

    }
}
