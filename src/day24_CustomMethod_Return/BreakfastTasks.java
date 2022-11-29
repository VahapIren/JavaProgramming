package day24_CustomMethod_Return;

public class BreakfastTasks {
    public static void main(String[] args) {

       initials("vahap","ıren");
       domain("vahapiren@gmail.com");
       String [] emails={"josh@gmail.com","jim@yahoo.com","elminur@cydeo.com","gulsen@amazon.com"};
        for (String each : emails) {
            domain(each);
        }
        nameMonths(12);
        for (int i = 1; i < 13; i++) {
            nameMonths(i);
        }
        nameOfDays(5);


    }
    public static void initials(String firstName,String lastName){
       String initial=firstName.charAt(0)+"."+lastName.charAt(0);
       initial=initial.toUpperCase();
        System.out.println("initial = " + initial);
    }
    public static void domain(String email){
        String domain=email.substring(email.indexOf("@")+1,email.lastIndexOf("."));
        System.out.println("domain: "+domain);
    }
    public static void nameMonths(int number){
        String name="";
        if (number>=1&&number<=12){
            name=(number==1)?"Jan":(number==2)?"Feb":(number==3)?"Mar":(number==4)?"Apr":(number==5)?"May":(number==6)?"Jun"
                    :(number==7)?"Jul":(number==8)?"Aug":(number==9)?"Sep":(number==10)?"Oct":(number==11)?"Nov":"Dec";
        }else{
            name="Invalid";
        }
        System.out.println("Month Name:"+name);
    }
    public static void nameOfDays(int number){
        if (number>=1&&number<=7){
            String dayName=(number==1)?"Mon":(number==2)?"Tue":(number==3)?"Wed":(number==4)?"Thu":(number==5)?"Fri"
                    :(number==6)?"Sat":"Sun";
            System.out.println(dayName);
        }else{
            System.out.println("Invalid");;
        }
    }



}
