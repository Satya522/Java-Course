package JavaQA;

import java.util.Scanner;

public class DivisionOfTwoBinaryNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the 1st binary numbers: ");
        String binary1 = scanner.nextLine();
        System.out.print("Enter the 2nd binary number: ");
        String binary2 = scanner.nextLine();

        int decimal1 = Integer.parseInt(binary1, 2);
        int decimal2 = Integer.parseInt(binary2, 2);

        int Division = decimal1 / decimal2;

        String binaryDivision = Integer.toBinaryString(Division);
        System.out.print("Division of 2 binary numbers is: "+ binaryDivision);
    }
}
