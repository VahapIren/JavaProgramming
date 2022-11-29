package day20_Arrays;

public class Classmates1 {
    public static void main(String[] args) {

        String[] classmates={"mesut kılıcarslan","Serkan Unen","Selami Gundogdu","Veli Kara","Mustafa Baz","Zulal Kutluer","Zafer F."};
        for (int i = 0; i < classmates.length; i++) {
            String initials=classmates[i].toUpperCase().charAt(0)+" "+classmates[i].toUpperCase().charAt(classmates[i].indexOf(" ")+1);
            System.out.println(initials);
        }


    }
}
