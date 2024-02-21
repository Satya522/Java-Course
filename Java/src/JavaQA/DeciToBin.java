package JavaQA;

import java.util.Scanner;

public class DeciToBin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the decimal number:");
        int decimal = scanner.nextInt();
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binary Number is: " + binary);
    }
}
