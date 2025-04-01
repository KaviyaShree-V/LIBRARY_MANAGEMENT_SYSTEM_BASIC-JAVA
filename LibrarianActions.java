package LibraryManagementSystem;

import java.util.Scanner;

public class LibrarianActions {
    static Scanner scanner = new Scanner(System.in);

    public void librarianLogin() {
        System.out.println("Welcome to the Library");
        System.out.println("Enter your Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your getId: ");
        String id = scanner.nextLine();
        for (ACTIONS librarian : ACTIONS.getDetails()) {
            if (librarian.getName().equals(name) && librarian.getId().equals(id)) {
                System.out.println("Login Successful!");
                LibraryActions.enterChoice();
                return;
            }
        }

        System.out.println("Login Unsuccessful! Try Again");
    }

    public void addStudents() {
        System.out.println("Do you want to add Students?");
        System.out.println("1. Yes \n2. No");
        int s = Integer.parseInt(scanner.nextLine());
        while (s != 2) {
            switch (s) {
                case 1:
                    System.out.println("Enter the student name to add: ");
                    scanner.next();
                    String addsname = scanner.nextLine().trim();
                    System.out.println("Enter the register number of a student: ");
                    String addsreg = scanner.nextLine();
                    ACTIONS.getDetails().add(new ACTIONS(addsname, addsreg));
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

    public void addLibrarians() {
        System.out.println("Do you want to add Students?");
        System.out.println("1. Yes \n2. No");
        int s = Integer.parseInt(scanner.nextLine());
        while (s != 2) {
            switch (s) {
                case 1:
                    System.out.println("Enter the Librarian name to add: ");
                    scanner.next();
                    String addsname = scanner.nextLine().trim();
                    System.out.println("Enter the register number of a student: ");
                    String addsreg = scanner.nextLine();
                    ACTIONS.getDetails().add(new ACTIONS(addsname, addsreg));
                    System.out.println("Librarian is Added Successfully!!!");
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
        System.out.println("Enter a Book name to Remove:");
        String nob = scanner.next();
        for (int o = 0; o < Library.getBook().size(); o++) {
            Book k = Library.getBook().get(o);
            if (k.getName().contains(nob)) {
                System.out.println("Enter no. of book to remove : ");
                int remove = scanner.nextInt();
                Library.getBook().removeIf(p -> k.getCount() < remove);
                k.setCount(k.getCount() - remove);
                System.out.println("The Book " + nob + " of count " + remove + " is removed Successfully");
            }
        }
    }

    public static void addBooks() {
        System.out.println("Add Books in Library");
        System.out.println("Enter the Title of the book:");
        String name = scanner.nextLine();
        System.out.println("Enter the name of the author for the book " + name);
        String author = scanner.nextLine();
        System.out.println("Enter the isbn number for the book " + name);
        String isbn = scanner.nextLine();
        System.out.println("Enter the Edition of the Book : ");
        int edition = Integer.parseInt(scanner.nextLine());
        boolean bookFound = false;
        for (var b : Library.getBook()) {
            if (b.getName().equals(name) && b.getAuthor().equals(author) && b.getIsbn().equals(isbn) && b.getEdition() == edition) {
                System.out.println("The Book is already present and its count is :" + b.getCount());
                System.out.println("Did you need to restock the books? \n1. Yes \n2. No");
                int s = Integer.parseInt(scanner.nextLine());
                if (s == 1) {
                    System.out.println("Enter the no. of books to add :");
                    int count = Integer.parseInt(scanner.nextLine());
                    Library.book.add(new Book(name, author, isbn, edition, count, true));
                    System.out.println("The Book is added Successfully");
                } else if (s == 2) {
                    System.out.println("Returning");
                }
                bookFound = true;
                break;
            }
        }
        if (!bookFound) {
            System.out.println("No books Found !\n You can add Books...");
            System.out.println("Enter the no. of books to add :");
            int count = Integer.parseInt(scanner.nextLine());
            Library.book.add(new Book(name, author, isbn, edition, count, true));
            System.out.println("The "+name+" is added Successfully");
        }
    }
}