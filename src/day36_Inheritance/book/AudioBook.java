package day36_Inheritance.book;

public class AudioBook extends Book{

    public int length;
    public String narrator;
    public AudioBook(String title, String type, String author, double price,int length,String narrator) {
        super(title, type, author, price);
        this.length=length;
        this.narrator=narrator;
    }
    public void listen(){
        System.out.println("I am listening audio book "+title);
    }

    public String toString() {
        return "AudioBook{" +
                "length=" + length +
                ", narrator='" + narrator + '\'' +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
