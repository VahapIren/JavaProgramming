package day36_Inheritance.book;

public class BookObject {
    public static void main(String[] args) {

      EBook eBook1=new EBook("Serenad","Love","Livaneli",120,355);
      AudioBook audioBook1=new AudioBook("Miserable","Drama","Victor Hugo",200,4,"Bahadır");

      eBook1.readBook();
        System.out.println(audioBook1.narrator);
        System.out.println(eBook1);
        System.out.println(audioBook1);
        audioBook1.listen();


    }
}
