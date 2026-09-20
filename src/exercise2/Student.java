package exercise2;

public class Student {

    private int studentID;
    private String name;
    private double GPA;

    public Student(int studentID, String name, double GPA) {
        this.studentID = studentID;
        this.name = name;
        this.GPA = GPA;
    }

    public void displayDetails() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("GPA: " + GPA);
        System.out.println();
    }
}
