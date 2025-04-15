# Student Data Entry with MySQL

This Java Assignment demonstrates a basic **Student Data Entry** application integrated with **MySQL** using **JDBC**.

## Features

- **Add Student**: Insert a new student record into the `students` table.
- **Display Students**: List all student records.
- **Search by PRN**: Find a student record based on `PRN`.
- **Update Student**: Change a student's name or batch.
- **Delete Student**: Remove a student entry from the database.

## Setup

 
1. Create a database named `studentdb` in MYSQL.
2. Place the **MySQL JDBC Driver** (e.g., `mysql-connector-java-x.x.xx.jar`) in your project's classpath or project dependancies.

## How to Run

1. **Compile** all Java files:
    ```bash
    javac Main.java DBConnection.java Student.java StudentOperations.java
    ```
2. **Run** the main application:
    ```bash
    java Main
    ```
3. Follow the **console prompts** to add, display, search, update, or delete student records.

 
