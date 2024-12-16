package src.JavaCourse.CoreJava.JavaMethods.PracticeQuestionSolution;

// You can solve this question using if-else statement but we can solve this using ternary operator.
// ternary operator is a short way to write if-else statement.
// Syntax: (condition) ? statement1 : statement2;
// if the condition is true then statement1 will be executed otherwise statement2 will be executed

// Nested ternary operator
// Syntax: (condition1) ? statement1 : (condition2) ? statement2 : statement3
// If condition1 is true then statement1 will be executed otherwise if condition2 is true then statement2 will be executed otherwise statement3 will be executed

import java.util.Scanner;

public class MaximumOfThree {

    public static void maxOfThree(int a, int b, int c){
        String result = (a > b) ? (a > c) ? "a is Greater" : "c is Greater" : (b > c) ? "b is Greater" : "c is " +
                "Greater.";
        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        maxOfThree(a,b,c);

    }
}
