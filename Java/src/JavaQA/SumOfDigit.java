//Ques: Write a Java program and compute the sum of an integer's digits.
package JavaQA;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        int sum =0;
        while(number>0)
        {
            sum += (number%10);
            number = number/10;

        }
        System.out.println("Sum of the digits is: "+ sum);
        // why we use scanner.close()?
        // scanner.close() is used to close the scanner class. it is used to prevent the resource leak.
        scanner.close();
    }
}
