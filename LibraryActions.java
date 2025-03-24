import java.util.Scanner;

public class LibraryActions extends Library
{
    static Scanner scanner=new Scanner(System.in);

    public static void enterChoice()
    {
        while (true)
        {
        System.out.println("Enter a choice to perform an action:");
        System.out.println(" 1. ADD BOOKS \n 2. SEARCH BOOKS \n 3. REMOVE BOOKS \n 4. BORROW BOOKS \n 5. E-book \n 6. EXIT");
        int choice = scanner.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("Add Books:");
                    addBooks();
                    break;
                case 2:
                    System.out.println("Search Books....");
                    searchBoooks();
                    break;
                case 3:
                    System.out.println("Remove Books.....");
                    removeBooks();
                    break;
                case 4:
                    System.out.println("Borrow Books.....");
                    borrowBooks();
                    break;
                case 5:
                    System.out.println("E-book.....");
                    eBook();
                    break;
                case 6:
                    System.out.println("Exiting....");
                    System.exit(5);
                    break;

                default:
                    System.out.println("Enter a Valid Choice:");
            }
        }
    }

    public static void searchBoooks()
    {
        System.out.println("Enter a Book name / author name to search :");
        scanner.nextLine();
        String name= scanner.nextLine();
        for (int i=0;i<getBook().size();i++)
        {
            Book b=getBook().get(i);
            if (b.getName().equals(name) || b.getAuthor().equals(name))
                {
                    System.out.println("NAME :" + b.getName());
                    System.out.println("AUTHOR: " + b.getAuthor());
                    System.out.println("ISBN :" + b.getIsbn());
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
                                removeBooks();
                                break;
                            default:
                                System.out.println("Thanks For Visiting....");
                                System.exit(3);
                        }
                    }break;
                }else {
                System.out.println("No Such Book Found In The Library");
            }
            if (getBook().isEmpty())
            {
                System.out.println("No books Available");
            }
        }
    }

    public static void removeBooks() {
        System.out.println("Enter a Book to Remove:");
        String nob = scanner.next();
        for (int o = 0; o < getBook().size(); o++) {
            Book k=getBook().get(o);
            if (k.getName().contains(nob)) {
                getBook().remove(o);
                System.out.println("The Book " + nob + " is removed Successfully");
            }
        }
    }

    public static void eBook(){
        System.out.println(" E-books");
        System.out.println("Did you need to read books... \n1. Yes \n2. No");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Read Books...  :)");
                System.out.println("Enter the Book or Author name to Read ");
                scanner.nextLine();
                String name = scanner.nextLine();
                for (int t = 0; t < book.size(); t++) {
                    Book g = getBook().get(t);
                    if (g.getName().contains(name)|| g.getAuthor().contains(name)){
                        System.out.println("Book is Opening..");
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

    public static void borrowBooks()
    {
        System.out.println("Enter your Name:");
        String name = scanner.next();
        System.out.println("Enter your Mobile Number:");
        String mob = scanner.next();
        System.out.println("Enter the Name of the Book:");
        String boo = scanner.next();
        for (int u=0;u< book.size();u++) {
            Book v=getBook().get(u);
            if (v.getName().contains(boo)) {
                System.out.println("The Book is Registered for the Reader " + name + " and you should return or Renew the book "+boo+"within 07 days");
                break;
            }else {
                System.out.println("There is no book matches in your need");
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
        book.add(new Book(name,author,isbn,true));
        System.out.println("The Book is added Successfully");
        book.add(new Book("Wings of Fire","Dr. A.P.J. Abdul Kalam","wof0010",true));
    }
}

