package day10_NestedIf;

public class NameOfMonths2 {
    public static void main(String[] args) {
        int number=5;
        String result="";
        if(number==1){
            result="January";
        }else if(number==2){
            result="February";
        }else if(number==3){
            result="March";
        }else if(number==4){
            result="April";
        }else if(number==5){
            result="May";
        }else if(number==6){
            result="June";
        }else if(number==7){
            result="July";
        }else if(number==8){
            result="August";
        }else if(number==9){
            result="September";
        }else if(number==10){
            result="October";
        }else if(number==11){
            result="November";
        }else {
            result="December";
        }
        System.out.println(result);
        System.out.println("--------------------");
        int m=7;
        String monthName=(m==1)?"Jan":(m==2)?"Feb":(m==3)?"Mar":(m==4)?"Apr":(m==5)?"May":(m==6)?"Jun"
                :(m==7)?"Jul":(m==8)?"Aug":(m==9)?"Sep":(m==10)?"Oct":(m==11)?"Nov":"Dec";
        System.out.println(monthName);

    }
}
