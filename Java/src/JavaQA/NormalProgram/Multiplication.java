package src.JavaQA.NormalProgram;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the 1st number:");
        int num1 = input.nextInt();

        System.out.println("Enter the 2nd number:");
        int num2 = input.nextInt();

        int mul = num1 * num2;

        System.out.println("Multiplication of two numbers is: " + mul );
    }
}