import java.util.ArrayList;

public class Librarian {
    private String name;
    private String id;
    private static ArrayList<Librarian> librarianDetails=new ArrayList<>();
    static {
        librarianDetails.add(new Librarian("L1","lp1"));
    }
    public Librarian(String name,String regNo){
        this.name=name;
        this.id=regNo;
    }
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}
