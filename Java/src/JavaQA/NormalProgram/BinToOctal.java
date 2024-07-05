package src.JavaQA.NormalProgram;

import java.util.Scanner;

public class BinToOctal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Binary Number:");
        String binary = scanner.nextLine();
        int integer = Integer.parseInt(binary, 2); // converting to integer
        String octal = Integer.toOctalString(integer); // converting to octal
        System.out.println("Octal number is: " + octal);
    }
}
