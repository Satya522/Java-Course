package JavaQA;

import java.util.Scanner;

public class MultiplicationOfTwoBinaryNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 1st binary number: ");
        String binary1 = scanner.nextLine();
        System.out.println("Enter the 2nd binary number: ");
        String binary2 = scanner.nextLine();

        // convert binary to decimal
        int decimal1 = Integer.parseInt(binary1, 2);
        int decimal2 = Integer.parseInt(binary2, 2);

        // multiply decimal numbers

        int product = decimal1 * decimal2;

        // convert product to binary

        String binaryProduct = Integer.toBinaryString(product);

        System.out.println(" Product of binary numbers is: "+binaryProduct);

    }
}
