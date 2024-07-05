package src.JavaCourse.DSA.BitManipulation;

public class BitwiseAND {
    public static void main(String[] args) {
        // Binary AND Operator
        // The & operator returns 1 if both bits are 1, otherwise 0.
        // 1 & 1 = 1
        // 1 & 0 = 0
        // 0 & 1 = 0
        // 0 & 0 = 0

        // Example 1: 5 & 3 = 1
        // 5 = 101
        // 3 = 011
        // 1 = 001
        int num1 = 5;
        int num2 = 3;
        int result = num1 & num2;
        System.out.println("5 & 3 = " + result);

        // Example 2: 12 & 7 = 4
        // 12 = 1100
        // 7  = 0111
        // 4  = 0100
        num1 = 12;
        num2 = 7;
        result = num1 & num2;
        System.out.println("12 & 7 = " + result);
    }
}
