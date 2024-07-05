package src.JavaCourse.DSA.BitManipulation;

public class LeftShift {
    public static void main(String[] args) {
        // Left Shift Operator
        // The << operator shifts the bits to the left by a certain number of positions.
        // The vacated positions are filled with zeros.
        // The left shift operator is equivalent to multiplying a number by 2^x, where x is the number of positions shifted.
        // num << x = num * 2^x

        // Example 1: 5 << 1 = 10
        // 5 = 101
        // 10 = 1010
        int num = 5;
        int result = num << 1;
        System.out.println("5 << 1 = " + result);

        // Example 2: 12 << 2 = 48
        // 12 = 1100
        // 48 = 110000
        num = 12;
        result = num << 2;
        System.out.println("12 << 2 = " + result);
    }
}
