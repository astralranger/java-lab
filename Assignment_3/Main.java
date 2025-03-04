// Piyush Gawade
// 23070126090
// B1

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager sm = new StudentManager();
        int choice;

        // menu loop
        do {
            System.out.println("\n--- Student Management ---");
            System.out.println("1. add student");
            System.out.println("2. display all students");
            System.out.println("3. search by prn");
            System.out.println("4. search by name");
            System.out.println("5. search by position");
            System.out.println("6. update student");
            System.out.println("7. delete student");
            System.out.println("0. exit");
            System.out.print("enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // clears buffer

            switch (choice) {
                case 1:
                    // add student input
                    System.out.print("enter PRN: ");
                    String prn = sc.nextLine();
                    System.out.print("enter name: ");
                    String name = sc.nextLine();
                    System.out.print("enter DoB (dd/mm/yyyy): ");
                    String dob = sc.nextLine();
                    System.out.print("enter marks: ");
                    int marks = sc.nextInt();
                    sm.addStudent(prn, name, dob, marks);
                    System.out.println("student added");
                    break;

                case 2:
                    // displays students
                    sm.displayStudents();
                    break;

                case 3:
                    // search by prn
                    System.out.print("enter PRN to search: ");
                    String searchPrn = sc.nextLine();
                    Student s1 = sm.searchByPrn(searchPrn);
                    if (s1 != null) {
                        System.out.println("found: " + s1);
                    } else {
                        System.out.println("not found");
                    }
                    break;

                case 4:
                    // search by name
                    System.out.print("enter name to search: ");
                    String searchName = sc.nextLine();
                    Student s2 = sm.searchByName(searchName);
                    if (s2 != null) {
                        System.out.println("found: " + s2);
                    } else {
                        System.out.println("not found");
                    }
                    break;

                case 5:
                    // search by position
                    System.out.print("enter position to search: ");
                    int pos = sc.nextInt();
                    Student s3 = sm.searchByPosition(pos);
                    if (s3 != null) {
                        System.out.println("found: " + s3);
                    } else {
                        System.out.println("invalid position");
                    }
                    break;

                case 6:
                    // update student
                    System.out.print("enter PRN to update: ");
                    String updatePrn = sc.nextLine();
                    System.out.print("enter new name: ");
                    String newName = sc.nextLine();
                    System.out.print("enter new DoB: ");
                    String newDob = sc.nextLine();
                    System.out.print("enter new marks: ");
                    int newMarks = sc.nextInt();
                    sm.updateStudent(updatePrn, newName, newDob, newMarks);
                    System.out.println("updated");
                    break;

                case 7:
                    // delete student
                    System.out.print("enter PRN to delete: ");
                    String deletePrn = sc.nextLine();
                    sm.deleteStudent(deletePrn);
                    System.out.println("deleted");
                    break;

                case 0:
                    System.out.println("exiting program");
                    break;

                default:
                    System.out.println("invalid choice");
            }
        } while (choice != 0);

        sc.close();
    }
}
