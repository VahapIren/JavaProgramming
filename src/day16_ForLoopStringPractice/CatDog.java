package day16_ForLoopStringPractice;

public class CatDog {
    public static void main(String[] args) {
        String str="cat  cAt Dog DOG dog";
        int countCat=0,countDog=0;

        for (int i = 0; i < str.length()-2; i++) {
            if (str.substring(i,i+3).equalsIgnoreCase("cat")){
                countCat++;
            } else if (str.substring(i,i+3).equalsIgnoreCase("dog")) {
                countDog++;
            }

        }
        System.out.println(countCat==countDog);
        }

    }

