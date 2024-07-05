package src.JavaCourse.CoreJava.JavaBasic.Operator;
// BINARY CONVERSION
/*
 How to convert decimal to binary?
 1. Divide the number by 2.
 2. Get the integer quotient for the next iteration.
 3. Get the remainder for the binary digit.
 4. Repeat the steps until the quotient is equal to 0.

 Example:
 1. 10/2 = 5, remainder = 0
 2. 5/2 = 2, remainder = 1
 3. 2/2 = 1, remainder = 0
 4. 1/2 = 0, remainder = 1

 10 = 1010 in binary.

 How to convert binary to decimal?
 1. Multiply every digit of the binary number with the power of two in increasing order.
 2. Sum all the result of the multiplication.

 Example:
 1. 1 * 2^3 = 8
 2. 0 * 2^2 = 0
 3. 1 * 2^1 = 2
 4. 0 * 2^0 = 0
 5. 8 + 0 + 2 + 0 = 10

 1010 = 10 in decimal.

 */
public class BitwiseOperator {
    public static void main(String[] args) {
        int a = 10; // 1010  // binary representation of 10 is 1010 in 4 bits.
        int b = 20; // 10100
        int c = 10; // 1010
        int result;

        // a = 1010
        // b = 10100
        // 1010 & 10100 = 10100
        /*
        How & Operator works?
        1. Convert the decimal number to binary.
        2. Compare the bits of the first operand with the bits of the second operand.
        3. If both bits are 1, then the result is 1.
        4. If both bits are 0, then the result is 0.
        5. If one of the bits is 0 and the other one is 1, then the result is 0.
         */

        /*
        Example:
        a = 10 = 1010
        b = 20 = 10100
        1010 & 10100 = 10100
        1 & 1 = 1
        0 & 0 = 0
        1 & 0 = 0
        10100 = 20
         */
        result = a & b;
        System.out.println(result); // 0

        // a = 1010
        // b = 10100
        // 1010 | 10100 = 11110

        /*
        How | operator works?
        1. Convert the decimal number to binary.
        2. Compare the bits of the first operand with the bits of the second operand.
        3. If one of the bits is 1, then the result is 1.
        4. If both bits are 0, then the result is 0.
        5. If both bits are 1, then the result is 1.
         */

        result = a | b; // | operator return 1 if any of the operands is 1.
        System.out.println(result); // 30

        // a = 1010
        // b = 10100
        // 1010 ^ 10100 = 11110

        /*
        How ^ operator works?
        1. Convert the decimal number to binary.
        2. Compare the bits of the first operand with the bits of the second operand.
        3. If both bits are 1, then the result is 0.
        4. If both bits are 0, then the result is 0.
        5. If one of the bits is 0 and the other one is 1, then the result is 1.
         */

        result = a ^ b; // ^ operator return 1 if both operands are different.
        System.out.println(result); // 30

        // a = 1010
        // b = 10100
        // 1010 << 10100 = 11110

        /*
        How << operator works?
        1. Convert the decimal number to binary.
        2. Shift the bits of the first operand to the left by the number of places specified by the second operand.
         */



        /*
        Example:
        a = 10 = 1010
        b = 20 = 10100
        1010 << 10100 = 10100000
        1010 << 10100 = 101000000

         */
        result = a << b;
        System.out.println(result);


        // a = 1010
        // b = 10100
        // 1010 >> 10100 = 11110

        /*
        How >> operator works?
        1. Convert the decimal number to binary.
        2. Shift the bits of the first operand to the right by the number of places specified by the second operand.
         */

        /*
        Example:
        a = 10 = 1010
        b = 20 = 10100
        1010 >> 10100 = 101
        1010 >> 10100 = 10
         */
        result = a >> b; // 1010 >> 10100 = 10
        System.out.println(result); // 0

        // a = 1010
        // b = 10100
        // 1010 >>> 10100 = 11110

        /*
        How >>> operator works?
        1. Convert the decimal number to binary.
        2. Shift the bits of the first operand to the right by the number of places specified by the second operand.
        3. the leftmost bits are filled with 0.
        Example:
        a = 10 = 1010
        b = 20 = 10100
        1010 >>> 10100 = 101
        1010 >>> 10100 = 10
         */
        result = a >>> b; // 1010 >>> 10100 = 10
        System.out.println(result); // 0

        // a = 1010
        // b = 10100
        // ~1010 = 11110

        /*
        How ~ operator works?
        1. Convert the decimal number to binary.
        2. Invert the bits of the first operand.
        3. 1 becomes 0 and 0 becomes 1.
        Example:
        a = 10 = 1010
        ~1010 = 0101
         */
        result = ~a; // ~1010 = 0101
        System.out.println(result); // -11


    }
}
