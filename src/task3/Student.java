package task3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Student {
    private String name;
    private int group;
    private int course;
    private HashMap<String, Integer> marks;

    public Student() {
        this.name = "";
        this.group = 0;
        this.course = 0;
        this.marks = new HashMap<>();
    }

    public Student(String name, int group, int course, HashMap<String, Integer> marks) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public HashMap<String, Integer> getMarks() {
        return marks;
    }

    public void setMarks(HashMap<String, Integer> marks) {
        this.marks = marks;
    }

    public double getAverageScore() {
        double sum = 0;
        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            sum = sum + entry.getValue();
        }

        return sum / marks.size();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group=" + group +
                ", course=" + course +
                ", marks=" + marks.toString() +
                '}';
    }

    public static Student generateStudent(String name) {
        HashMap<String, Integer> m = new HashMap<>();
        Random random = new Random();

        m.put("Математика", random.nextInt(10) + 1);
        m.put("Физика", random.nextInt(10) + 1);
        m.put("Русский", random.nextInt(10) + 1);

        return new Student(name, random.nextInt(12) + 1, random.nextInt(4) + 1, m);
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("Студенты курса " + course + ":");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public boolean updateCourse() {
        if (this.course == 4) {
            return false;
        }

        if (this.getAverageScore() >= 3) {
            this.course = this.course + 1;
            return true;
        } else {
            return false;
        }
    }

    public static void removeLag(List<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            if (!students.get(i).updateCourse()) {
                students.remove(i);
            }
        }
    }

}
