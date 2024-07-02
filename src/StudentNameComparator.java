import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        // Custom ordering based on name
        return s1.getName().compareTo(s2.getName());
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Alice"));
        students.add(new Student(1, "Bob"));
        students.add(new Student(2, "Charlie"));

        // Sort by custom comparator
        Collections.sort(students, new StudentNameComparator());

        for (Student student : students) {
            System.out.println(student);
        }
    }
}