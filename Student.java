import java.util.ArrayList;

public class Student {
    private String name;
    private String regNo;

    private static ArrayList<Student> studentDetails=new ArrayList<>();

    static {
        studentDetails.add(new Student("S1","sp1"));
    }
    public Student(String name,String regNo){
        this.name=name;
        this.regNo=regNo;
    }

    public String getName() {
        return name;
    }

    public String getRegNo() {
        return regNo;
    }

    public static ArrayList<Student> getStudentDetails() {
        return studentDetails;
    }
}
