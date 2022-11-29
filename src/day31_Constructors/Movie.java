package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class Movie {
    public String country,title,Genre,releaseDate,director;
    public ArrayList<String> casts;

    public Movie(String country, String title, String releaseDate, String director) {
        this.country = country;
        this.title = title;
        this.releaseDate = releaseDate;
        this.director = director;
    }
    public void addCast(String argument){
        ArrayList<String> casts=new ArrayList<>();
        casts.add(argument);
        System.out.println(casts);
    }
    public ArrayList<String> addCast(){
        String [] array={"Asiya","Adam","Muhtar","Veli","Mesut","Serkan","Zulal","Zafer"};
        ArrayList<String > casts=new ArrayList<>(Arrays.asList(array));
        return casts;
    }


    public String toString() {
        return " Movie\n" +
                " country=" + country + '\n' +
                " title=" + title + '\n' +
                " Genre= Adventure, Comedy, Thriller" +  '\n' +
                " releaseDate=" + releaseDate + '\n' +
                " director=" + director + '\n' +
                " Casts=" + addCast();
    }
}
