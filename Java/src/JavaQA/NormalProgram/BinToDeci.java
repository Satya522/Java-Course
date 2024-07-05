package src.JavaQA.NormalProgram;

import java.util.Scanner;

public class BinToDeci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Binary Number:");
        String binary = scanner.nextLine();
        int decimal = Integer.parseInt(binary, 2);
        System.out.println("Decimal Number is: " + decimal);

    }
}
