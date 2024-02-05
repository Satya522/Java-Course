// Ww will discuss Unary Operator and its type and how it is work.
package JavaCourse.Operator;
public class UnaryOperator {
    public static void main(String[] args) {
       int a = 15;
       int b = ++a; // pre-increment: 1st value are changed then assign to b. example--> a =11, b= 11
      // int c = a--; // pre-decrement:
       System.out.println(a);
       System.out.println(b);
      // System.out.println(c);

        int x = 10;
        int y = x++; // post-increment:1st value assign to y then later change the value of x .
        //int z = x--; // post-decrement:
        System.out.println(x);
        System.out.println(y);
        //System.out.println(z);

    }
}
