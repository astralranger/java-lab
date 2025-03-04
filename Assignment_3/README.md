Class and Method Descriptions
Student.java
This file defines the Student class, which represents a single student.

Attributes:
private String prn: The student's unique registration number.
private String name: The student's name.
private String dob: The student's date of birth (format: dd/mm/yyyy).
private int marks: The student's marks.
Constructors:
public Student(): Default constructor. Sets all attributes to empty strings or zero.
Purpose: Creates an empty student object.
public Student(String prn, String name, String dob, int marks): Parameterized constructor. Initializes a student with given values.
Purpose: Creates a student with specific details.
Getters and Setters:
public String getPrn(): Returns the PRN.
public void setPrn(String prn): Sets the PRN.
public String getName(): Returns the name.
public void setName(String name): Sets the name.
public String getDob(): Returns the date of birth.
public void setDob(String dob): Sets the date of birth.
public int getMarks(): Returns the marks.
public void setMarks(int marks): Sets the marks.
Purpose: These methods access or modify the private attributes.
Other Methods:
public String toString(): Returns a string with student details (PRN, name, DoB, marks).
Purpose: Makes it easy to print student info.
StudentManager.java
This file manages an ArrayList of Student objects and defines all the operations.

Attributes:
private ArrayList<Student> students: Stores the list of students.
Constructor:
public StudentManager(): Initializes the ArrayList.
Purpose: Sets up an empty list to hold students.
Methods:
public void addStudent(String prn, String name, String dob, int marks):
Purpose: Creates a new Student object and adds it to the list.
Parameters: PRN, name, DoB, and marks of the student.
public void displayStudents():
Purpose: Shows all students in the list with their position (index). Prints "no students yet" if the list is empty.
public Student searchByPrn(String prn):
Purpose: Searches for a student by PRN and returns the Student object if found, or null if not.
Parameter: PRN to search for.
public Student searchByName(String name):
Purpose: Searches for a student by name (case-insensitive) and returns the Student object if found, or null if not.
Parameter: Name to search for.
public Student searchByPosition(int pos):
Purpose: Returns the student at the given position (index) in the list, or null if the position is invalid.
Parameter: Position (index) in the list.
public void updateStudent(String prn, String newName, String newDob, int newMarks):
Purpose: Updates the details of a student with the given PRN. Prints "student not found" if no match.
Parameters: PRN to find the student, and new name, DoB, and marks to update.
public void deleteStudent(String prn):
Purpose: Removes the student with the given PRN from the list. Prints "no such student" if not found.
Parameter: PRN of the student to delete.
Main.java
This file contains the main program with a menu-driven interface.

Main Method:
public static void main(String[] args):
Purpose: Runs the program, displays the menu, and handles user input using a Scanner.
Features:
Loops until the user chooses to exit (option 0).
Uses a switch statement to call methods from StudentManager based on user choice.
Menu Options:
Add Student: Prompts for PRN, name, DoB, and marks, then adds the student.
Display All Students: Shows all students in the list.
Search by PRN: Asks for a PRN and displays the matching student or "not found".
Search by Name: Asks for a name and displays the matching student or "not found".
Search by Position: Asks for a position and displays the student at that index or "invalid position".
Update Student: Prompts for a PRN and new details, then updates the student.
Delete Student: Asks for a PRN and deletes the matching student.
Exit: Ends the program.
Features
Uses an ArrayList to store student objects dynamically.
Implements separate methods for each operation (add, display, search, update, delete).
Demonstrates OOP concepts: classes, constructors, instance members, and encapsulation.