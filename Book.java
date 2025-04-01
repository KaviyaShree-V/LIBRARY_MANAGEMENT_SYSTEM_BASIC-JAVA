package LibraryManagementSystem;

public class Book {
    //Fields
    private String name;
    private String author;
    private String isbn;
    private int edition;
    private int count;
    private boolean status;

    // Constructor to create a new Book instance.
    public Book(String title,String author, String isbn,int edition,int count, boolean status){
        this.name=title;
        this.author=author;
        this.isbn=isbn;
        this.edition=edition;
        this.count=count;
        this.status=status;
    }
    // Getter methods

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

    // Setter method

    public int setCount(int c){
        this.count=c;
        return count;
    }

    //Main method - calls LibraryActions.login()

    public static void main(String[] args) {
        LibraryActions.login();
    }

}
