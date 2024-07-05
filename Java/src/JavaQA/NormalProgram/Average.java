//Write a Java program that takes three numbers as input to calculate and print the average of the numbers ?
package src.JavaQA.NormalProgram;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the 2nd number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the 3rd number: ");
        int num3 = scanner.nextInt();
        float average = (float) (num1 + num2 + num3) / 3;
        System.out.println("The average of 3 numbers is: " + average);


    }
}
