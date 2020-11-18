package Practice2.Views;

import Practice2.Controller.StudentController;
import Practice2.Model.Student;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentViews {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> student = new ArrayList<>();
        StudentController studentController = new StudentController();
        int choice;
        System.out.println("Welcome to Student");
        do {
            System.out.println("==========================");
            System.out.println("Menu: ");
            System.out.println("1. Add student records");
            System.out.println("2. Display student records");
            System.out.println("3. Save new records.");
            System.out.println("4. Exit the program");
            System.out.print("Your Choice: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    studentController.add(student);
                    break;
                case 2:
                    studentController.display(student);
                    break;
                case 3:
                    studentController.save(student);
                    break;
                case 4:
                    System.out.println("Exit!");
                    break;
                default:
                    System.out.println("Please try again");
            }
        } while (choice != 4);
    }
}
