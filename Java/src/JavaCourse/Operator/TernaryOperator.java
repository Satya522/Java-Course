package JavaCourse.Operator;
/*
How ternary operator works?
The ternary operator works like an if-else statement. It is the only conditional operator that takes three operands.
The ternary operator is written as:
variable x = (expression) ? value if true : value if false
If the expression is true then assign the value on the left side of the colon (:) otherwise assign the value on the right side of the colon (:).
 */
public class TernaryOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = (a > b) ? a : b;

        System.out.println(c);
    }
}
