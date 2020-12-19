package lesson4;

public class Student extends Person {
    int grade;

    public Student(String name, int grade) {
        super(name);
        this.grade = grade;
        System.out.println("Student with name constructor and grade");
    }

    public Student() {
        System.out.println("Student empty constructor");
    }
}
