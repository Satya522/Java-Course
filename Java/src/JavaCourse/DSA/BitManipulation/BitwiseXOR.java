package src.JavaCourse.DSA.BitManipulation;

public class BitwiseXOR {
    public static void main(String[] args) {
        // Binary XOR Operator
        // The ^ operator returns 1 if the bits are different, otherwise 0.
        // 1 ^ 1 = 0
        // 1 ^ 0 = 1
        // 0 ^ 1 = 1
        // 0 ^ 0 = 0

        // Example 1: 5 ^ 3 = 6
        // 5 = 101
        // 3 = 011
        // 6 = 110
        int num1 = 5;
        int num2 = 3;
        int result = num1 ^ num2;
        System.out.println("5 ^ 3 = " + result);

        // Example 2: 12 ^ 7 = 11
        // 12 = 1100
        // 7  = 0111
        // 11 = 1011
        num1 = 12;
        num2 = 7;
        result = num1 ^ num2;
        System.out.println("12 ^ 7 = " + result);
    }
}
