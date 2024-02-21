package JavaCourse.IntroductionOfJava;
import java.util.Scanner;

public class InputFunction{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int intInput = scanner.nextInt();

        System.out.println("Enter a float:");
        float floatInput = scanner.nextFloat();

        System.out.println("Enter a double:");
        double doubleInput = scanner.nextDouble();

        // To consume the remaining newline
        scanner.nextLine();

        System.out.println("Enter a string:");
        String stringInput = scanner.nextLine();

        System.out.println("Enter a boolean:");
        boolean booleanInput = scanner.nextBoolean();

        System.out.println("You entered:");
        System.out.println("Integer: " + intInput);
        System.out.println("Float: " + floatInput);
        System.out.println("Double: " + doubleInput);
        System.out.println("String: " + stringInput);
        System.out.println("Boolean: " + booleanInput);
    }
}