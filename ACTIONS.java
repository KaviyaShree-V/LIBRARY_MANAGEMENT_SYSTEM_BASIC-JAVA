package LibraryManagementSystem;

import java.util.ArrayList;

public class ACTIONS {

    private  String name;
    private  String id;
    private static ArrayList<ACTIONS> details=new ArrayList<>();
    static {
        setDetails(new ACTIONS("L1", "lp1"));
        setDetails(new ACTIONS("S1","sp1"));
    }

    public ACTIONS(String name,String id){
        this.name=name;
        this.id=id;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public static ArrayList<ACTIONS> getDetails() {
        return details;
    }

    public static void setDetails(ACTIONS librarian) {
        details.add(librarian);
    }

}
