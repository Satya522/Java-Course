package src.JavaCourse.DSA.BitManipulation;

public class ZeroFillLeftShift {
    public static void main(String[] args) {
        // Zero-fill left shift Operator
        // The << operator shifts the bits to the left. The leftmost bits fall off and are filled with 0.
        // 1 << 1 = 2
        // 1 << 2 = 4
        // 1 << 3 = 8
        // 1 << 4 = 16
        // 1 << 5 = 32

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
