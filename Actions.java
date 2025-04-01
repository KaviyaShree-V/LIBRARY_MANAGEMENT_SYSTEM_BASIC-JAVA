package LibraryManagementSystem;

import java.util.ArrayList;

public class Actions {

    private  String name;
    private  String id;
    private static ArrayList<Actions> details=new ArrayList<>();
    static {
        setDetails(new Actions("L1", "lp1"));
        setDetails(new Actions("S1","sp1"));
        setDetails(new Actions("t1","tp1"));
    }

    public Actions(String name,String id){
        this.name=name;
        this.id=id;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public static ArrayList<Actions> getDetails() {
        return details;
    }

    public static void setDetails(Actions librarian) {
        details.add(librarian);
    }

}
