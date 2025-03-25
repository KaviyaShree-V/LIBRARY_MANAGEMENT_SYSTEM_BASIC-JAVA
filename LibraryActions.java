import java.util.Scanner;

public class LibraryActions extends Library
{
    static Scanner scanner=new Scanner(System.in);

    public static void enterChoice()
    {
        while (true)
        {
        System.out.println("Enter a choice to perform an action:");
        System.out.println(" 1. ADD BOOKS \n 2. SEARCH BOOKS \n 3. REMOVE BOOKS \n 4. BORROW BOOKS \n 5. E-book \n 6. View Books \n 7. EXIT");
        int choice = scanner.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("Add Books:");
                    addBooks();
                    break;
                case 2:
                    System.out.println("Search Books....");
                    System.out.println("Are you need to Search Books by \n1. Book NAme \n2. Author ");
                    int r= scanner.nextInt();
                    if (r==1){
                        System.out.println("Searching Books by Title....");
                        searchBoooks();
                    }else if (r==2){
                        System.out.println("Searching Books by Title....");
                        System.out.println("Enter the Author Name:");
                        scanner.nextLine();
                        String bn=scanner.nextLine();
                        searchBoooks(bn);
                    }else {
                        System.out.println("Enter a valid choice");
                    }
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
                    DigitalLibrary.eBook();
                    break;
                case 6:
                    System.out.println("View All Books....");
                    viewBooks();
                    break;
                case 7:
                    System.out.println("Exiting....");
                    System.exit(7);
                    break;

                default:
                    System.out.println("Enter a Valid Choice:");
            }
        }
    }

    public static void searchBoooks()
    {
        System.out.println("Enter a Book name :");
        scanner.nextLine();
        String name= scanner.nextLine();
        for (int i=0;i<getBook().size();i++)
        {
            Book b=getBook().get(i);
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
                                removeBooks();
                                break;
                            default:
                                System.out.println("Thanks For Visiting....");
                                System.exit(3);
                        }
                    }
                    break;
                }
            else
                {
                System.out.println("No Such Book Found In The Library");
            }
            if (getBook().isEmpty())
            {
                System.out.println("No books Available");
            }
        }
    }

    public static void searchBoooks(String authorName)
    {
//        System.out.println("Enter a Book name / author name to search :");
//        scanner.nextLine();
//        String name= scanner.nextLine();
        for (Book i  : book)
        {
//            Book b=i;
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
                System.out.println("Enter no. of book to remove : ");
                int remove= scanner.nextInt();
                getBook().removeIf(p -> k.getCount() < remove);
                k.setCount(k.getCount()-remove);
                System.out.println("The Book " + nob + " of count "+remove+" is removed Successfully");
            }
        }
    }

    public static void viewBooks(){
        System.out.println("Viewing Books...");
        for (Book book1:book){
            System.out.println("Book Name: "+book1.getName());
            System.out.println("Author Name: "+book1.getAuthor());
            System.out.println("Isbn : "+book1.getIsbn());
            System.out.println("Edition: "+book1.getEdition());
            System.out.println("Stock :"+book1.getCount());
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
        System.out.println("Enter the Edition of the Book : ");
        int edition = scanner.nextInt();
        System.out.println("Enter the no. of books to add :");
        int count= scanner.nextInt();
        book.add(new Book(name,author,isbn,edition,count,true));
        System.out.println("The Book is added Successfully");
        book.add(new Book("Wings of Fire","Dr. A.P.J. Abdul Kalam","wof0010",1,6,true));
    }
}

