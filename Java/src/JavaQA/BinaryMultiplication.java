package JavaQA;

// Multiplication of two binary numbers using Integer.parseInt() method

import java.util.Scanner;

public class BinaryMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the 1st binary number: ");
        String binary1 = scanner.nextLine();
        System.out.println("Enter the 2nd binary number: ");
        String binary2 = scanner.nextLine();

        // ab hum binary input ko decimal me change karenge

        int decimal = Integer.parseInt(binary1, 2);
        int decimal2 = Integer.parseInt(binary2,2);

        int multiplication = decimal * decimal2;

        // ab hum phir se decimal ko binary me change kar denge

        String binary = Integer.toBinaryString(multiplication);
        System.out.println("Multiplication of two binary number is: " + binary);
    }
}
