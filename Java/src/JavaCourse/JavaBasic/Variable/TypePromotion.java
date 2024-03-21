package JavaCourse.JavaBasic.Variable;
/*
 Type promotion is the automatic conversion of a smaller data type to larger data type
 Rules:
 1. All byte, short, and char values are promoted to int.
 2. if one operand is a long, the whole expression is promoted to long.
 3. if one operand is a float, then whole expression is promoted to float.
 4. if any operand is a double then the result is double.

 byte -> short -> int -> long -> float -> double
 char -> int -> long -> float -> double

 */

public class TypePromotion {
    public static void main(String[] args) {
        int a = 10;
        float b = 20.25f;
        long c  = 30;
        double d = 40.25;
        double ans = a + b + c + d; // java convert all the data type like int,float,long to double because double is
        // the longest data type in java.

        // if you want to check promotion then you can use this code
        // int ans = a + b + c + d;   or float ans = a + b + c + d;  or long ans = a + b + c + d;
        System.out.println(ans);

        // if want to promote the data type forcefully then you can use this code
        // int ans = (int) a + b + c + d;   or float ans = (float) a + b + c + d;  or long ans = (long) a + b + c + d;
        // System.out.println(ans);   // but you can't promote the data type larger data type to smaller data type.

    }
}
