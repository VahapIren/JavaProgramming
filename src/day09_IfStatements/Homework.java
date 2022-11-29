package day09_IfStatements;



public class Homework {
    public static void main(String[] args) {

        String str = "MI";

        if (str== "Mac"){
            System.out.println(str+" operating system is MacOS");
        } else if (str== "Lenovo") {
            System.out.println(str+" operating system is Windows");
        } else if (str=="Iphone") {
            System.out.println(str+" operating system is IOS");
        } else if (str== "Samsung") {
            System.out.println(str+" operating system is Android");
        }else if(str.equals("MI")) {
            System.out.println(str+" operating system is Android");
        }
    }
}
