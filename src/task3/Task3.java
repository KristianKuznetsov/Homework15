package task3;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void build() {

        List<Student> students = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            students.add(Student.generateStudent("ST" + i));
        }

        System.out.println(students);

        System.out.println("\n2:");
        Student.printStudents(students, 2);

        Student.removeLag(students);

        System.out.println(students);

        System.out.println("\n2:");
        Student.printStudents(students, 2);

    }
}
