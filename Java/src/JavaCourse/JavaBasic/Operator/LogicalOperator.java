package JavaCourse.JavaBasic.Operator;

public class LogicalOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 10;
        boolean result;

        // a > b is false
        result = (a > b) && (a == b);   // && operator return true if both operands are true.
        System.out.println(result); // false

        // a > b is false
        result = (a > b) || (a == b); // || operator return true if any of the operands is true.
        System.out.println(result); // false

        // a > b is false
        result = !(a > b); // ! operator reverse the result of the expression.
        System.out.println(result); // true

        // a > b is false
        result = !(a < b); // a<b is true but ! operator reverse the result of the expression.
        System.out.println(result); // false

        // a > b is false
        result = !(a == b);
        System.out.println(result); // true

        // a == c is true
        result = (a > b) && (a == c);
        System.out.println(result); // true

        // a == c is true
        result = (a > b) || (a == c);
        System.out.println(result); // true
    }
}
