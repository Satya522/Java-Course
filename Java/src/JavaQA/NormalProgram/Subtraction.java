package src.JavaQA.NormalProgram;

import java.util.Scanner;

public class Subtraction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the 1st number:");
        int num1 = input.nextInt();

        System.out.println("Enter the 2nd number:");
        int num2 = input.nextInt();

        int sub = num1 - num2;

        System.out.println("Subtraction of two numbers is: " + sub);
    }
}