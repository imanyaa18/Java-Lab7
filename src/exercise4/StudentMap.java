package exercise4;

import exercise2.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentMap {

    public static void main(String[] args) {

        Map<Integer, Student> studentMap = new HashMap<>();

        Student student1 = new Student(1, "Imnaya", 3.56);
        Student student2 = new Student(2, "Sandali", 3.78);
        Student student3 = new Student(3, "Kavithma", 3.2);

        studentMap.put(1, student1);
        studentMap.put(2, student2);
        studentMap.put(3, student3);

        Scanner input = new Scanner(System.in);

        System.out.print("Enter student number: ");
        int studentNumber = input.nextInt();

        Student student = studentMap.get(studentNumber);

        if (student != null) {
            student.displayDetails();
        } else {
            System.out.println("Student not found.");
        }
    }
}