package LibraryManagementSystem;

import java.util.ArrayList;

public class Library {
    //Fields
    private String name;
    private String author;
    //Arraylist to store the books list
    static ArrayList<Book> book = new ArrayList<>();
    //static initializer
    static {
        book.add(new Book("Wings of Fire", "Dr. A.P.J. Abdul Kalam", "wof0010", 1, 6, true));
    }
    //getter
    public static ArrayList<Book> getBook() {
        return book;
    }

}
