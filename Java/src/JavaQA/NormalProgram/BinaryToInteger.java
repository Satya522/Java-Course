// Binary data to integer conversion
package src.JavaQA.NormalProgram;

import java.util.Scanner;

public class BinaryToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the binary number: ");
        String binary = scanner.nextLine();

        // Binary data ko integer me convert karne ke liye hum Integer.parseInt() method use karenge.
        int IntegerConvert = Integer.parseInt(binary, 2);
        System.out.println("Integer number is: " + IntegerConvert);


    }
}
