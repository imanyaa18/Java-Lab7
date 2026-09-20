package exercise2;

import java.util.ArrayList;
import java.util.Collection;

public class StudentList {

    public static void main(String[] args) {

        Collection<Student> StudentList = new ArrayList<>();

        Student student1 = new Student(1, "Imanya", 3.56);
        Student student2 = new Student(2, "Sandali", 3.78);
        Student student3 = new Student(3, "Kavithma", 3.2);

        StudentList.add(student1);
        StudentList.add(student2);
        StudentList.add(student3);

        for (Student student : StudentList) {
            student.displayDetails();
        }
    }
}
