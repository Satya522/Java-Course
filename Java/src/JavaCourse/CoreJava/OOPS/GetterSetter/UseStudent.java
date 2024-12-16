package src.JavaCourse.CoreJava.OOPS.GetterSetter;

public class UseStudent {
    public static void main(String[] args) {
        // Create an object of the Student class
        Student student = new Student();

        // Set values using setters
        student.setName("Satyendra");
        student.setAge(22);

        // Get values using getters
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());

        // Validation test
        student.setName(""); // Invalid name
        student.setAge(-5);  // Invalid age
    }
}
