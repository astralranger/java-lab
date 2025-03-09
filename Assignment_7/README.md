


---

## Prerequisites
- **MySQL**: A MySQL server must be running locally on port 3306 with a database named `student_db`.
- **Database Table**: The `students` table must exist with the following schema:
  ```sql
  CREATE TABLE students (
      PRN INT PRIMARY KEY,
      Name VARCHAR(100),
      Branch VARCHAR(50),
      Batch VARCHAR(10),
      CGPA FLOAT
  );
  ```
---
## File: `Main.java`

### `Main.java`
This class serves as the entry point for the application.

- **Class**: `Main`
  - **Method**: `main(String[] args)`
    - **Purpose**: Initiates the program by calling static methods from `StudentOperations`.
    - **Implementation**:
      - Calls `StudentOperations.insertStudent()` to add a new student record.
      - Calls `StudentOperations.viewStudents()` to display all student records.
    - **Additional Notes**: Includes student information (name, ID, batch) as comments.
  - **Notes**: No instance of `StudentOperations` is created because its methods are static.

---

## File: `StudentOperations.java`

### `StudentOperations.java`
This class contains the core logic for interacting with the MySQL database.

- **Class**: `StudentOperations`
  - **Fields**:
    - `public static final String URL`: Database connection URL (`jdbc:mysql://localhost:3306/student_db`).
    - `private static final String USER`: Database username (`root`).
    - `private static final String PASSWORD`: Database password (`sit123`).
    - **Notes**: Adjust `URL`, `USER`, and `PASSWORD` based on your MySQL setup.
  - **Method**: `insertStudent()`
    - **Purpose**: Inserts a new student record into the `students` table.
    - **Implementation**:
      - Establishes a database connection using `DriverManager.getConnection()`.
      - Uses a `PreparedStatement` to safely insert user-provided data into the SQL query:
        ```sql
        INSERT INTO students (PRN, Name, Branch, Batch, CGPA) VALUES (?, ?, ?, ?, ?)

  
