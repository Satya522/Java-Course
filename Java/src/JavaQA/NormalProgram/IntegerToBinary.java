//Write a Java program to convert an integer number to a binary number.
package src.JavaQA.NormalProgram;

import java.util.Scanner;

public class IntegerToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int number = scanner.nextInt();

        // convert integer to binary

        String binaryConvert = Integer.toBinaryString(number);
        System.out.println("Binary number is: " + binaryConvert);
    }
}
