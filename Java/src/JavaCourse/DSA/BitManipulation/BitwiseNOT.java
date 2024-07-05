package src.JavaCourse.DSA.BitManipulation;

public class BitwiseNOT {
    public static void main(String[] args) {
        // Binary NOT Operator
        // The ~ operator returns the complement of a number.
        // 0 -> 1
        // 1 -> 0

        // Example 1: ~5 = -6
        // 5 = 0000 0000 0000 0000 0000 0000 0000 0101
        // ~5 = 1111 1111 1111 1111 1111 1111 1111 1010
        int num = 5;
        int result = ~num;
        System.out.println("~5 = " + result);

        // Example 2: ~12 = -13
        // 12 = 0000 0000 0000 0000 0000 0000 0000 1100
        // ~12 = 1111 1111 1111 1111 1111 1111 1111 0011
        num = 12;
        result = ~num;
        System.out.println("~12 = " + result);
    }
}
