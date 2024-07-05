package src.JavaCourse.DSA.BitManipulation;

public class ZeroFillRightShift {
    public static void main(String[] args) {
        // Zero-fill right shift operator
        // The >>> operator shifts the bits of a number to the right and fills 0 on voids left as a result.
        // 0000 0101 >>> 2 = 0000 0001
        // 0000 0101 >>> 3 = 0000 0000
        // 1111 1010 >>> 2 = 0011 1110
        // 1111 1010 >>> 3 = 0001 1111

        // Example 1: 5 >>> 2 = 1
        // 5 = 0000 0000 0000 0000 0000 0000 0000 0101
        // 5 >>> 2 = 0000 0000 0000 0000 0000 0000 0000 0001
        int num = 5;
        int result = num >>> 2;
        System.out.println("5 >>> 2 = " + result);

        // Example 2: 12 >>> 3 = 1
        // 12 = 0000 0000 0000 0000 0000 0000 0000 1100
        // 12 >>> 3 = 0000 0000 0000 0000 0000 0000 0000 0001
        num = 12;
        result = num >>> 3;
        System.out.println("12 >>> 3 = " + result);
    }
}
