package LibraryManagementSystem;

import java.util.Scanner;

public class LibraryActions extends Library {
    static Scanner scanner = new Scanner(System.in);

    //method for login
    public static void login() {
        System.out.println("1. Student Login \n2. Staff Login \n3. Librarian Login");
        System.out.println("Enter the choice: ");
        int choice = scanner.nextInt();
        //checking the login cases
        switch (choice) {
            case 1:
                CommonActions.login();
                break;
            case 2:
                CommonActions.login();
                break;
            case 3:
                CommonActions.login();
                break;
            default:
                System.out.println("Enter the valid choice: ");
                break;
        }
    }

    //method to display choices or actions to perform
    public static void enterChoice() {
        int choice = 0;
        while (choice != 9) {//Continuous menu until exit
            System.out.println("Enter a choice to perform an action:");
            System.out.println(" 1. ADD BOOKS \n 2. SEARCH BOOKS \n 3. REMOVE BOOKS \n 4. BORROW BOOKS \n 5. E-book \n 6. View Books \n 7.View All Books \n 8. Add Students & Librarians \n 9. EXIT");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Add Books:");
                    LibrarianActions.addBooks();
                    break;
                case 2:
                    System.out.println("Search Books....");
                    System.out.println("Are you need to Search Books by \n1. Book NAme \n2. Author ");
                    int r = scanner.nextInt();
                    if (r == 1) {
                        System.out.println("Searching Books by Title....");
                        CommonActions.searchBoooks();
                    } else if (r == 2) {
                        System.out.println("Searching Books by Title....");
                        System.out.println("Enter the Author Name:");
                        scanner.nextLine();
                        String bn = scanner.nextLine();
                        CommonActions.searchBoooks(bn);
                    } else {
                        System.out.println("Enter a valid choice");
                    }
                    CommonActions.searchBoooks();
                    break;
                case 3:
                    System.out.println("Remove Books.....");
                    LibrarianActions.removeBooks();
                    break;
                case 4:
                    System.out.println("Borrow Books.....");
                    CommonActions.borrowBooks();
                    break;
                case 5:
                    System.out.println("E-book.....");
                    DigitalLibrary.eBook();
                    break;
                case 6:
                    System.out.println("View Books");
                    CommonActions.viewBooks();
                    break;
                case 7:
                    System.out.println("View All Books....");
                    CommonActions.viewAllBooks();
                    break;
                case 8:
                    System.out.println("Adding students/Librarians..");
                    System.out.println("\n1. Yes \n2. No");
                    System.out.println("Enter choice:");
                    int n = Integer.parseInt(scanner.nextLine());
                    if (n == 1) {
                        LibrarianActions l = new LibrarianActions();
                        l.addStudents();
                    } else if (n == 2) {
                        LibrarianActions s = new LibrarianActions();
                        s.addLibrarians();
                    }
                    break;
                case 9:
                    System.out.println("Exiting....");
                    System.exit(9);

                default:
                    System.out.println("Enter a Valid Choice:");
            }
        }
    }
}

