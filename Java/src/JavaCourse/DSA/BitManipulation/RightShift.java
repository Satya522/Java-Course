package src.JavaCourse.DSA.BitManipulation;

public class RightShift {
    public static void main(String[] args) {
        // Binary Right Shift Operator
        // The >> operator shifts the bits of a number to the right.
        // The leftmost bits are filled with the sign bit (1 for negative numbers, 0 for positive numbers).
        // For positive numbers, the result is the same as dividing the number by 2^n (2 raised to the power of n).
        // For negative numbers, the result is the same as dividing the number by 2^n and rounding towards negative infinity.

        // Example 1: 10 >> 1 = 5
        // 10 = 0000 0000 0000 0000 0000 0000 0000 1010
        // 5  = 0000 0000 0000 0000 0000 0000 0000 0101
        int num = 10;
        int result = num >> 1;
        System.out.println("10 >> 1 = " + result);

        // Example 2: -15 >> 2 = -4
        // -15 = 1111 1111 1111 1111 1111 1111 1111 0001
        // -4  = 1111 1111 1111 1111 1111 1111 1111 1100
        num = -15;
        result = num >> 2;
        System.out.println("-15 >> 2 = " + result);
    }
}
