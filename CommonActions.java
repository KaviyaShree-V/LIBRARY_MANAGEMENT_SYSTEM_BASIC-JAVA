package LibraryManagementSystem;

import java.util.Scanner;

public class CommonActions {
    static Scanner scanner=new Scanner(System.in);

    //method for login
    public static void login() {
        System.out.println("Welcome to the Library");
        System.out.println("Enter your Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your Id no. : ");
        String id = scanner.nextLine();
        for (Actions login : Actions.getDetails()) {
            if (login.getName().equals(name) && login.getId().equals(id)) {
                System.out.println("Login Successful!");
                LibraryActions.enterChoice();
                return;
            }
        }

        System.out.println("Login Unsuccessful! Try Again");
    }

    //method to search the books
    public static void searchBoooks()
    {
        System.out.println("Enter a Book name :");
        scanner.nextLine();
        String name= scanner.nextLine();
        for (int i=0;i<Library.getBook().size();i++)
        {
            Book b=Library.getBook().get(i);
            if (b.getName().equals(name))
            {
                System.out.println("NAME :" + b.getName());
                System.out.println("AUTHOR: " + b.getAuthor());
                System.out.println("ISBN :" + b.getIsbn());
                System.out.println("Edition: "+b.getEdition());
                System.out.println("Available Stock : "+b.getCount());
                System.out.println("Did you need to Borrow / Remove the Book : \n1. Yes \n2. No");
                int c= scanner.nextInt();
                if (c==1)
                {
                    System.out.println("1. Borrow \n2. Remove ");
                    int choice = scanner.nextInt();
                    switch (choice)
                    {
                        case 1:
                            System.out.println("Borrow Books");
                            borrowBooks();
                            break;
                        case 2:
                            System.out.println("Remove Books");
                            LibrarianActions.removeBooks();
                            break;
                        default:
                            System.out.println("Thanks For Visiting....");
                            System.exit(3);
                    }
                }else
                {
                    System.out.println("No Such Book Found In The Library");
                }
                break;
            }

            if (Library.getBook().isEmpty())
            {
                System.out.println("No books Available");
            }
        }
    }

    //method to search books through author names
    public static void searchBoooks(String authorName)
    {
        for (Book i  : Library.book)
        {
            if (i.getAuthor().equals(authorName))
            {
                System.out.println("NAME :" + i.getName());
                System.out.println("AUTHOR: " + i.getAuthor());
                System.out.println("ISBN :" + i.getIsbn());
                System.out.println("Edition: "+i.getEdition());
                System.out.println("Available Stock : "+i.getCount());
                System.out.println("Did you need to Borrow / Remove the Book : \n1. Yes \n2. No");
                int c= scanner.nextInt();
                if (c==1)
                {
                    System.out.println("1. Borrow \n2. Remove ");
                    int choice = scanner.nextInt();
                    switch (choice)
                    {
                        case 1:
                            System.out.println("Borrow Books");
                            borrowBooks();
                            break;
                        case 2:
                            System.out.println("Remove Books");
                            LibrarianActions.removeBooks();
                            break;
                        default:
                            System.out.println("Thanks For Visiting....");
                            System.exit(3);
                    }
                }break;
            }else {
                System.out.println("No Such Book Found In The Library");
            }
            if (Library.getBook().isEmpty())
            {
                System.out.println("No books Available");
            }
        }
    }

    //method to  view all books
    public static void viewAllBooks(){
        System.out.println("Viewing Books...");
        for (Book book1:Library.book){
            System.out.println("Book Name: "+book1.getName());
            System.out.println("Author Name: "+book1.getAuthor());
            System.out.println("Isbn : "+book1.getIsbn());
            System.out.println("Edition: "+book1.getEdition());
            System.out.println("Stock :"+book1.getCount());
        }
    }

    //method to view specific books
    public static void viewBooks(){
        System.out.println("Enter the specific book name to View :");
        scanner.nextLine();
        String b1= scanner.nextLine();
        for (Book b:Library.getBook()){
            if (b.getName().contains(b1)){
                System.out.println("Book Name: "+b.getName());
                System.out.println("Author Name: "+b.getAuthor());
                System.out.println("Isbn : "+b.getIsbn());
                System.out.println("Edition: "+b.getEdition());
                System.out.println("Stock :"+b.getCount());
            }
        }
    }

    //method to borrow books
    public static void borrowBooks() {
        System.out.println("Enter your Name:");
        String name = scanner.next();
        System.out.println("Enter your Mobile Number:");
        String mob = scanner.next();
        System.out.println("Enter the Name of the Book:");
        scanner.nextLine();
        String boo = scanner.nextLine();
        boolean bookfound = false;
        for (int u = 0; u < Library.book.size(); u++) {
            Book v = Library.getBook().get(u);
            if (v.getName().contains(boo)) {
                System.out.println("Enter the Number books to Borrow :");
                int borrow = Integer.parseInt(scanner.nextLine());
                System.out.println("The Book is Registered for the Reader " + name + " and you should return or Renew the book " + boo + "within 07 days");
                int x= v.getCount();
                int y= x-borrow;
                v.setCount(y);
                bookfound = true;
                break;
            }
            System.out.println("There is no book matches in your need");
            break;
        }
    }
}
