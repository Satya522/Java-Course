package src.JavaQA.NormalProgram;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the 1st number:");
        int num1 = input.nextInt();

        System.out.println("Enter the 2nd number:");
        int num2 = input.nextInt();

        int add = num1 + num2;

        System.out.println("Addition of two numbers is: " + add);
    }
}