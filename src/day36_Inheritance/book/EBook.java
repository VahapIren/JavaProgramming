package day36_Inheritance.book;

public class EBook extends Book{
    public int page;
    public EBook(String title, String type, String author, double price,int page) {
        super(title, type, author, price);
        this.page=page;
    }
    public void readBook(){
        System.out.println("I am reading the "+title);
    }

}
