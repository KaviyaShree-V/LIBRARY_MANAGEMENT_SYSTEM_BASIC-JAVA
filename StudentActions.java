import java.util.Scanner;

public class StudentActions{
    Scanner scanner=new Scanner(System.in);
    public void studentLogin(){
        System.out.println("Welcome to the Library");
        System.out.println("Enter your Name: ");
        scanner.nextLine();
        String name= scanner.nextLine();
        System.out.println("Enter your Regno.: ");
        String regNo = scanner.nextLine();
        for (Student student:Student.getStudentDetails()) {
            if (student.getName().equals(name) && student.getRegNo().equals(regNo)) {
                LibraryActions.enterChoice();
            } else {
                System.out.println("Login Unsuccessful!  Try Again");
                return;
            }
        }
    }
}
