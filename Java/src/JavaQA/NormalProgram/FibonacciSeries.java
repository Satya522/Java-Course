package src.JavaQA.NormalProgram;

import java.util.Scanner;

public class FibonacciSeries {

// Fibonacci Series without using Recursion

    /*
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter the number of terms for Fibonacci Series: ");
        int n = scanner.nextInt();
        int num1 = 0, num2 = 1;
        System.out.print("Fibonacci Series of " + n + " terms: ");
        for(int i=1; i<=n;i++)
        {
            System.out.print(num1 + " ");
            // On each iteration, We are assigning second number to the first number and assigning the sum of first
            // and second number to the second number.

            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;

        }
    }
 }
 */

    // Fibonacci Series using recursion

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms for Fibonacci series: ");
        int n = scanner.nextInt();

        System.out.print("Fibonacci Series of " + n + " terms: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}

