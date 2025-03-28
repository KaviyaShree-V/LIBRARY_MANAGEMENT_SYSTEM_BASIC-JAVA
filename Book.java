import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book {
    static Scanner scanner=new Scanner(System.in);
    private String name;
    private String author;
    private String isbn;
    private int edition;
    private int count;
    private boolean status;
    public Book(String title,String author, String isbn,int edition,int count, boolean status){
        this.name=title;
        this.author=author;
        this.isbn=isbn;
        this.edition=edition;
        this.count=count;
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
    public int getEdition() {
        return edition;
    }
    public int getCount() {
        return count;
    }
    public int setCount(int c){
        this.count=c;
        return count;
    }
    public static void main(String[] args) {
        LibraryActions.login();
    }
}
