package src.JavaCourse.CoreJava.JavaBasic.Variable;
import java.util.Scanner;
public class InputInJava {
    public static void main(String[] args) {
        // Input in Java
        // To get input from the user, we need to use the Scanner class.
        // The Scanner class is present in the java.util package.
        // To use the Scanner class, we need to create an object of the class, and we can use the object to get input from the user.

        // Import the Scanner class
       // import java.util.Scanner;

        // Create an object of the Scanner class
        Scanner sc = new Scanner(System.in);

        // Getting input in Java
        // There are different methods in the Scanner class to get input from the user.
        // Some of the methods are:
        // nextInt() - To get an integer value from the user.
        // nextDouble() - To get a double value from the user.
        // next() - To get a string value from the user.

        // Example to get an integer value
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("The number is: " + num);

        // Example to get a string value
        System.out.println("Enter your name: ");
        String name = sc.next();
        System.out.println("Your name is: " + name);

        // Closing the Scanner object
        // It is good practice to close the Scanner object after using it.
        // To close the Scanner object, we can use the close() method.
        sc.close();
    }
}
