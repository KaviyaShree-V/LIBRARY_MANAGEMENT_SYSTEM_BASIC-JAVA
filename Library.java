package LibraryManagementSystem;

import java.util.ArrayList;

public class Library {
    private String name;
    private String author;

    static ArrayList<Book> book = new ArrayList<>();
    static {
        book.add(new Book("Wings of Fire", "Dr. A.P.J. Abdul Kalam", "wof0010", 1, 6, true));
    }
    public static ArrayList<Book> getBook() {
        return book;
    }

}
