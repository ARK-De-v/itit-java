import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        //Write a program in java for Online Attendance. The conditions are as follow:
        //Application aske the user to enter the banned students names first to be saved.
        //Apllication ask  user to get his name for attendance
        //User provides their name as Input and then application show message to “Welcome to their Name
        //when any user enters a banned student name as username, the application fire an exception and fire alarm as well as prints error message.

        
        Scanner scanner = new Scanner(System.in);
        String name = "";
        System.out.println("Enter the banned students names separeted by comma");
        String bannedStudent = scanner.nextLine();
        String[] bannedStudents = bannedStudent.split(",");
        System.out.println("Enter your name: ");
        name = scanner.nextLine();
        if (Arrays.asList(bannedStudents).contains(name)) {
            System.out.println("You are banned");
        } else {
            System.out.println("Welcome to " + name);
        }
        
    }
}
