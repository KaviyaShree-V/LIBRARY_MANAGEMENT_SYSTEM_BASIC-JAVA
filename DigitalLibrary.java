package LibraryManagementSystem;

import java.util.Scanner;

public class DigitalLibrary extends Library {
    static Scanner scanner = new Scanner(System.in);
    public static void eBook(){
        System.out.println(" E-books");
        System.out.println("Did you need to read books... \n1. Yes \n2. No");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Read Books...  :)");
                System.out.println("Enter the LibraryManagementSystem.Book or Author name to Read ");
                scanner.nextLine();
                String name = scanner.nextLine();
                for (Book t: Library.book) {
//                    LibraryManagementSystem.Book g =t;
                    if (t.getName().contains(name)|| t.getAuthor().contains(name)){
                        System.out.println("LibraryManagementSystem.Book is Opening..");
                        System.out.println(" Start Reading :) ");
                        break;
                    }else {
                        System.out.println(" No Books available");
                    }
                }
                break;
            case 2:
                System.out.println("Thanks for Visiting...");
                System.exit(2);
                break;
            default:
                System.out.println("Enter a Valid Choice..");
                break;
        }
    }
}
