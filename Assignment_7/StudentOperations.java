import java.sql.*;  // imports JDBC classes for database connectivity
import java.util.*; // imports Scanner class for user input

public class StudentOperations {
    // database connection URL (adjust 'student_db' if your database has a different name)
    public static final String URL = "jdbc:mysql://localhost:3306/student_db"; 

    // database username and password (change these if your MySQL credentials are different)
    private static final String USER = "root";  
    private static final String PASSWORD = "sit123";

    // method to insert a student record into the database
    public static void insertStudent() {
        try (
            // establishing a connection to the database
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

            // preparing an SQL statement to insert student details
            PreparedStatement stmt = conn.prepareStatement(
                "INSERT INTO students (PRN, Name, Branch, Batch, CGPA) VALUES (?, ?, ?, ?, ?)"
            )
        ) {
            Scanner scan = new Scanner(System.in); // scanner to take input from the user

            // prompting the user for student details
            System.out.println("Enter PRN: ");
            int prn = scan.nextInt();  // read PRN (unique ID for the student)
            scan.nextLine(); // consume the newline character left by nextInt()

            System.out.println("Enter Name: ");
            String name = scan.nextLine(); // read student name

            System.out.println("Enter Branch: ");
            String branch = scan.nextLine(); // read student branch

            System.out.println("Enter Batch: ");
            String batch = scan.nextLine(); // read student batch

            System.out.println("Enter CGPA: ");
            float cgpa = scan.nextFloat(); // read CGPA (floating-point value)

            // setting values in the prepared SQL statement
            stmt.setInt(1, prn);
            stmt.setString(2, name);
            stmt.setString(3, branch);
            stmt.setString(4, batch);
            stmt.setFloat(5, cgpa);

            // executing the insert statement, which returns the number of affected rows
            int numberRows = stmt.executeUpdate();

            // if at least one row is affected, insertion was successful
            if (numberRows > 0) {
                System.out.println("Student Data Inserted");
            }

        } catch (SQLException e) {
            // prints the error message if something goes wrong
            System.out.println(e);
        }
    }

    // method to retrieve and display all student records from the database
    public static void viewStudents() {
        try (
            // establishing a connection to the database
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

            // creating a statement to execute SQL queries
            Statement stmt = conn.createStatement();

            // executing a SELECT query to fetch all student records
            ResultSet rs = stmt.executeQuery("SELECT * FROM students")
        ) {
            System.out.println("--------------Student Record -------------");

            // iterating through the result set to display each student's details
            while (rs.next()) {
                System.out.println("PRN: " + rs.getInt("PRN") +
                        ", Name: " + rs.getString("Name") +
                        ", Branch: " + rs.getString("Branch") +
                        ", Batch: " + rs.getString("Batch") +
                        ", CGPA: " + rs.getFloat("CGPA"));
            }

            System.out.println("*****************************************************");

        } catch (SQLException e) {
            // prints the error details if something goes wrong
            e.printStackTrace();
        }
    }
}

