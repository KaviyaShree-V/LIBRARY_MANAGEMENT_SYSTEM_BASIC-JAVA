import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book {
    static Scanner scanner=new Scanner(System.in);
    private String name;
    private String author;
    private String isbn;
    private boolean status;
    public Book(String title,String author, String isbn, boolean status){
        this.name=title;
        this.author=author;
        this.isbn=isbn;
        this.status=status;
    }
    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public static void main(String[] args) {
        LibraryActions.enterChoice();
    }
}
