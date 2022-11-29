package day14_String;

public class EmailTasks1 {
    public static void main(String[] args) {
        String email="mike_tyson@gmail.com";
        String name=email.substring(0,email.indexOf("_"));
        System.out.println(name);
        String surName=email.substring(email.indexOf("_")+1,email.indexOf("@"));
        System.out.println(surName);


       if (email.contains("_")){

            email=(surName+"_"+name+email.substring(email.indexOf("@")));
           System.out.println(email);



        }else{
            System.out.println(email);
        }
    }
}
