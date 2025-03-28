import java.util.Scanner;

public class LibrarianActions {
    static Scanner scanner=new Scanner(System.in);
    public void librarianLogin(){
        System.out.println("Welcome to the Library");
        System.out.println("Enter your Name: ");
        String name= scanner.nextLine();
        System.out.println("Enter your getId.: ");
        String id = scanner.nextLine();
        Librarian librarian=new Librarian(name, id);
        if (librarian.getName().equals(name)&&librarian.getId().equals(id)){
            LibraryActions.enterChoice();
        }else {
            System.out.println("Login Unsuccessful!  Try Again");
        }
    }
    public void addStudents(){
        System.out.println("Do you want to add Students?");
        System.out.println("1. Yes \n2. No");
        int s= scanner.nextInt();
        while (s!=2) {
            switch (s) {
                case 1:
                    System.out.println("Enter the student name to add: ");
                    scanner.nextLine();
                    String addsname = scanner.nextLine();
                    System.out.println("Enter the register number of a student: ");
                    String addsreg = scanner.nextLine();
                    Student.getStudentDetails().add(new Student(addsname, addsreg));
                    System.out.println("Student is Added Successfully!!!");
                    break;
                case 2:
                    System.out.println("Returning...");
                    return;
                default:
                    System.out.println("Enter a valid choice: ");
                    break;
            }
        }
    }

    public static void removeBooks() {
        System.out.println("Enter a Book to Remove:");
        String nob = scanner.next();
        for (int o = 0; o < Library.getBook().size(); o++) {
            Book k=Library.getBook().get(o);
            if (k.getName().contains(nob)) {
                System.out.println("Enter no. of book to remove : ");
                int remove= scanner.nextInt();
                Library.getBook().removeIf(p -> k.getCount() < remove);
                k.setCount(k.getCount()-remove);
                System.out.println("The Book " + nob + " of count "+remove+" is removed Successfully");
            }
        }
    }

    public static void addBooks()
    {
        System.out.println("Add Books in Library");
        System.out.println("Enter the Title of the book:");
        scanner.nextLine();
        String name=scanner.nextLine();
        System.out.println("Enter the name of the author for the book "+name);
        String author =scanner.next();
        System.out.println("Enter the isbn number for the book "+name);
        String isbn = scanner.next();
        System.out.println("Enter the Edition of the Book : ");
        int edition = scanner.nextInt();
        System.out.println("Enter the no. of books to add :");
        int count= scanner.nextInt();
        Library.book.add(new Book(name,author,isbn,edition,count,true));
        System.out.println("The Book is added Successfully");
        Library.book.add(new Book("Wings of Fire","Dr. A.P.J. Abdul Kalam","wof0010",1,6,true));
    }
}
