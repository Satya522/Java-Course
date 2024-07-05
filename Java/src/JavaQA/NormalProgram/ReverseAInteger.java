package src.JavaQA.NormalProgram;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ReverseAInteger {

    public static void reverse(int number)
    {
        int reversed =0;
        while(number !=0)
        {
            int lastDigit = number % 10;
            reversed = reversed * 10 + lastDigit;
            number /= 10;

        }
        System.out.println("Reversed number: " + reversed);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        reverse(number);
    }
}
