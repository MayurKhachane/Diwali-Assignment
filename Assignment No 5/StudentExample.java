import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class StudentExample {

    static class LowAttendanceException extends Exception {
        public LowAttendanceException(String message) {
            super(message);
        }
    }

    static class Student implements Serializable {
        int rollNo;
        String sname;
        String course;
        int attendance_percentage;
        int score;


        public Student() {}

    
        public Student(int rollNo, String sname, String course, int attendance_percentage, int score) {
            this.rollNo = rollNo;
            this.sname = sname;
            this.course = course;
            this.attendance_percentage = attendance_percentage;
            this.score = score;
        }

        public String calculateGrade() {
            if (score >= 90) return "A";
            else if (score >= 60) return "B";
            else return "C";
        }

    
        public void checkAttendance() throws LowAttendanceException {
            if (attendance_percentage < 60) {
                throw new LowAttendanceException("Attendance less than 60% for: " + sname);
            }
        }

        @Override
        public String toString() {
            return rollNo + " " + sname + " " + course + " " + attendance_percentage + "% " + score + " Grade:" + calculateGrade();
        }
    }

    // Main method
    public static void main(String[] args) {
        Student[] students = new Student[10];

        // Add 10 students
        students[0] = new Student(1, "Mayur", "Computer", 70, 95);
        students[1] = new Student(2, "Ravi", "Mechanical", 50, 65);
        students[2] = new Student(3, "Sneha", "Electrical", 80, 75);
        students[3] = new Student(4, "Kishor", "Civil", 90, 85);
        students[4] = new Student(5, "Harsha", "Mech", 60, 50);
        students[5] = new Student(6, "Anjali", "Computer", 55, 88);
        students[6] = new Student(7, "Pooja", "Electrical", 95, 92);
        students[7] = new Student(8, "Rohan", "Civil", 65, 77);
        students[8] = new Student(9, "Nisha", "Computer", 75, 83);
        students[9] = new Student(10, "Vikram", "Mechanical", 45, 69);

        for (Student s : students) {
            try {
                s.checkAttendance();
            } catch (LowAttendanceException e) {
                System.out.println(e.getMessage());
            }
        }

    
        Arrays.sort(students, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return s2.attendance_percentage - s1.attendance_percentage;
            }
        });


        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students.ser"))) {
            oos.writeObject(students);
            System.out.println("\nStudents serialized to students.ser\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        
        System.out.println("Students sorted by decreasing attendance:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
