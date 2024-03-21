package JavaCourse.JavaBasic.Operator;

public class AssignmentOperator {
    public static void main(String[] args) {
        // Assignment operator
        int a = 10;   // = is a assignment operator
        int b = 5;
        System.out.println(a); // 10
        System.out.println(b); // 5

        // Addition assignment
        a += b; // a = a + b   // += is an assignment operator
        System.out.println(a); // 15

        // Subtraction assignment
        a -= b; // a = a - b
        System.out.println(a); // 10

        // Multiplication assignment
        a *= b; // a = a * b
        System.out.println(a); // 50

        // Division assignment
        a /= b; // a = a / b
        System.out.println(a); // 10

        // Modulus assignment
        a %= b; // a = a % b
        System.out.println(a); // 0

        // Left shift assignment
        a <<= b; // a = a << b    // << left shift operator: is a binary operator which is shift the bit value of a
        // number to the left side of the operator and fill the empty bits with 0.
        System.out.println(a); // 0

        // Right shift assignment
        a >>= b; // a = a >> b
        System.out.println(a); // 0

        // Bitwise AND assignment
        a &= b; // a = a & b
        System.out.println(a); // 0

        // Bitwise exclusive OR assignment
        a ^= b; // a = a ^ b
        System.out.println(a); // 0

        // Bitwise inclusive OR assignment
        a |= b; // a = a | b
        System.out.println(a); // 5
    }
}
