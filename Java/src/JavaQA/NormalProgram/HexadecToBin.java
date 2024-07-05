package src.JavaQA.NormalProgram;

import java.util.Scanner;

public class HexadecToBin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Hexadecimal number: ");
        String hexadecimal =  scanner.nextLine();         //"AF";  // input like:
        int decimal = Integer.parseInt(hexadecimal, 16); // Converting to Decimal number
        String binary = Integer.toBinaryString(decimal); // Converting to Binary number
        System.out.println("Binary number is: " + binary);

    }
}
