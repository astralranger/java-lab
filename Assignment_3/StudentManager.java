import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students;

    // constructor initializes arraylist
    public StudentManager() {
        students = new ArrayList<>();
    }

    // adds a new student
    public void addStudent(String prn, String name, String dob, int marks) {
        Student s = new Student(prn, name, dob, marks);
        students.add(s);
    }

    // displays all students
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("no students yet");
        } else {
            for (int i = 0; i < students.size(); i++) {
                System.out.println(i + ": " + students.get(i));
            }
        }
    }

    // searches student by prn
    public Student searchByPrn(String prn) {
        for (Student s : students) {
            if (s.getPrn().equals(prn)) {
                return s;
            }
        }
        return null;
    }

    // searches student by name
    public Student searchByName(String name) {
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                return s;
            }
        }
        return null;
    }

    // searches student by position
    public Student searchByPosition(int pos) {
        if (pos >= 0 && pos < students.size()) {
            return students.get(pos);
        }
        return null;
    }

    // updates student details
    public void updateStudent(String prn, String newName, String newDob, int newMarks) {
        Student s = searchByPrn(prn);
        if (s != null) {
            s.setName(newName);
            s.setDob(newDob);
            s.setMarks(newMarks);
        } else {
            System.out.println("student not found");
        }
    }

    // deletes student by prn
    public void deleteStudent(String prn) {
        Student s = searchByPrn(prn);
        if (s != null) {
            students.remove(s);
        } else {
            System.out.println("no such student");
        }
    }
}