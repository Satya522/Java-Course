//Write a Java program to add two binary numbers.
/*
How to add Binary numbers works?
For example:
1101
+ 101
-----
10010
1. First, we have to add the last digit of each number.
1 + 1 = 10
2. 10 is a 2-digit number, so we write the last digit 0 and carry 1 to the next calculation.
3. Then, we add the second last digits of each number.
1 + 0 + 1 = 10
4. Again, 10 is a 2-digit number, so we write down 0 and carry 1.
5. Now, we add the third last digits of each number.
1 + 1 + 0 = 10
6. We write down 0 and carry 1.
7. Finally, we add the remaining digits.
1 + 0 = 1
8. We write down 1.
9. Since, there is no digit remaining in the numbers, we stop the calculation.
10. So, the answer is 10010.
*/
package src.JavaQA.NormalProgram;

import java.util.Scanner;

public class AdditionBinaryNumber {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the 1st binary number: ");
            String bin1 = scanner.nextLine();
            System.out.print("Enter the 2nd binary number: ");
            String bin2 = scanner.nextLine();
/*
//       //  Convert binary to decimal number we use Integer.parseInt() method with base 2
//       // Integer.parseInt() pahle se bani huyi method hai java me binary ko decimal me convert karne ke liye isliye
//       //  hum iska use karte hai
//       //  Integer.parseInt() method ka use karne ke liye hume Integer class ka object create karna padega.


        int num1 = Integer.parseInt(bin1, 2);// 2 is the radix or base for binary number
        int num2 = Integer.parseInt(bin2, 2);

        // Add the numbers
        int sum = num1 + num2;

        // Convert the sum back to binary
        String result = Integer.toBinaryString(sum);

       System.out.println("The sum of the two binary numbers is: " + result);
        // or another method
     */
        String result = addBinary(bin1, bin2);
        // calling the method addBinary() jo ki java me pahle se bani hai
        // isliye call karne ke liye hume object create karne ki jarurat nahi hai.

        System.out.println("The sum of the two binary numbers is: " + result);
    }

    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0;

        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';
            result.append(sum % 2);
            carry = sum / 2;
        }

        if (carry != 0) result.append(carry);
        return result.reverse().toString();

    }
}