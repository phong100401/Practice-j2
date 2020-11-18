package Practice2.Views;

import Practice2.Controller.StudentController;
import Practice2.Model.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentViews {

    public static void main(String[] args) {
        StudentController stdCtrl = new StudentController();
        StudentViews stdView = new StudentViews();
        List<Student> stdList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do{
            System.out.println("1. Add student records\n" +
                    "2. Display student records\n" +
                    "3. Save\n" +
                    "4. Exit");
            System.out.println("Your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    break;
                case 2:
                    stdCtrl.displayStudent(stdList);
                    break;
                case 3:
                    stdCtrl.updateToDB(stdList);
                    break;
                case 4:
                    System.out.println("Thank you. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }while (choice != 4);
    }

    public class StudentView {
        List<Student> stdList = new ArrayList<>();

        public List<Student> addStudent() {
            StudentController stdCrl = new StudentController();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Student ID: ");
            String id = scanner.nextLine();
            System.out.println("Enter Student Name:");
            String name = scanner.nextLine();
            System.out.println("Enter Student Address:");
            String address = scanner.nextLine();
            System.out.println("Enter Student Phone:");
            int phone = Integer.parseInt(scanner.nextLine());
            Student obj = new Student(id, name, address, phone);
            stdList.add(obj);
            System.out.println("Student has been added");
            return stdList;
        }
    }
}
