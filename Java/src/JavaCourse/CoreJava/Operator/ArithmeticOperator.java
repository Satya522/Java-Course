package src.JavaCourse.CoreJava.JavaBasic.Operator;

public class ArithmeticOperator {
    public static void main(String[] args) {
        // Arithmetic operator
        int a = 10;
        int b = 5;
        System.out.println(a); // 10
        System.out.println(b); // 5

        // Addition
        System.out.println(a + b); // 15

        // Subtraction
        System.out.println(a - b); // 5

        // Multiplication
        System.out.println(a * b); // 50

        // Division
        System.out.println(a / b); // 2

        // Modulus
        System.out.println(a % b); // 0  // Modulus(%) operator is used to find the remainder of two numbers.

        // Increment Operator: increment operator is used to increment the current value of a variable by 1. they are
        // two types of increment operator: pre-increment and post-increment/
        // Pre-increment: pre-increment operator is used to increment the current value of a variable by 1 before using
        // it in an expression.
        // Post-increment: post-increment operator is used to increment the current value of a variable by 1 after using
        // it in an expression.

        System.out.println(++a); // 11
        System.out.println(a++); // 11
        System.out.println(a); // 12

        // Decrement Operator: decrement operator is used to decrement the current value of a variable by 1. they are
        // two types of decrement operator: pre-decrement and post-decrement/
        // Pre-decrement: pre-decrement operator is used to decrement the current value of a variable by 1 before using
        // it in an expression.
        // Post-decrement: post-decrement operator is used to decrement the current value of a variable by 1 after using
        // it in an expression.

        System.out.println(--a); // 11
        System.out.println(a--); // 11
        System.out.println(a); // 10
    }
}
