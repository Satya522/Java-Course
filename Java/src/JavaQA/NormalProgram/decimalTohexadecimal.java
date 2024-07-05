//Write a Java program to convert a decimal number to a hexadecimal number.
package src.JavaQA.NormalProgram;

import java.util.Scanner;

// decimal number are those number which are in base 10 --> 0,1,2,3,4,5,6,7,8,9 are the decimal number
public class decimalTohexadecimal{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the decimal number: ");
        int decimalNumber = scanner.nextInt();
        // ab hum decimal number ko hexadecimal me change karenge
        String hexadecimalConvert = Integer.toHexString(decimalNumber);
        System.out.println("Hexadecimal number is: " + hexadecimalConvert);
    }
}
