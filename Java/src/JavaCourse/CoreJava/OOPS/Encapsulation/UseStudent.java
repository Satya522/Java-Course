package src.JavaCourse.CoreJava.OOPS.Encapsulation;

public class UseStudent {
    public static void main(String[] args) {
        Student s = new Student();
        s.setStudent(101,"Raj", 78.5);
        s.showStudent();

        Student p = new Student();
        p.setStudent(102,"Ravi", 85.4);
        p.showStudent();
    }
}
