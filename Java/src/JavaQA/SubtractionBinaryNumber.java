package JavaQA;

import java.util.Scanner;

// Subtracting of two binary numbers
public class SubtractionBinaryNumber {
    public static void main(String[] args) {
        // Method 1 - Using Integer.parseInt() method

        Scanner scanner = new Scanner(System.in);

        // getting the input from user
        System.out.print("Enter the 1st Binary number: ");
        String binary1 = scanner.nextLine();
        System.out.print("Enter the 2nd number: ");
        String binary2 = scanner.nextLine();

        // converting the binary number to decimal number

        int decimal1 = Integer.parseInt(binary1, 2);
        int decimal2 = Integer.parseInt(binary2, 2);

        // Subtracting the decimal numbers

        int Subtraction = decimal1 - decimal2;

        // converting the decimal to binary
        String binary = Integer.toBinaryString(Subtraction);
        System.out.println("Subtraction of two binary numbers: "+ binary);

    }
}
