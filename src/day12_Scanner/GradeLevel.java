package day12_Scanner;

public class GradeLevel {
    public static void main(String[] args) {
        byte age=28;
        String result="";
        if(age>=1&&age<=18) {
            switch (age) {
                case 6:
                case 7:
                case 8:
                    result = "Middle school";
                    break;
                case 9:
                case 10:
                case 11:
                case 12:
                    result = "Hıgh school";
                    break;
                case 13:
                case 14:
                case 15:
                    ;
                case 16:
                    result = "College";
                    break;
                case 17:
                case 18:
                    result = "Grad school";
                    break;
                default:
                    result = "Elementary school";
                    break;

            }
        }else
            result="Invalid Grade";

            System.out.println(result);
        }
    }

