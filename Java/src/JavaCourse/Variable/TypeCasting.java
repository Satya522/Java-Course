package JavaCourse.Variable;
/*
TYPE CASTING-->
Type casting in Java is a process of converting one data type into another. There are two types of casting in Java:

        - **Widening Casting (Automatic)**: This type of casting is done automatically when passing a smaller size type to a larger size type.
          byte --> short --> int --> long --> float --> double

        - **Narrowing Casting (Explicitly done)**: This type of casting must be done manually by placing the type in parentheses in front of the value.
          double --> float --> long --> int --> short --> byte
        Here's an example of both:

 */

public class TypeCasting {
    public static void main(String[] args) {
        // Widening Casting or Implicit Casting
        int myInt = 9;
        float myFloat = myInt; // Automatic casting: int to float
        double myDouble = myInt;  // Automatic casting: int to double
        System.out.println(myInt);      // Outputs 9
        System.out.println(myFloat);    // outputs 9.0
        System.out.println(myDouble);   // Outputs 9.0

        // Narrowing Casting or Explicit Casting
        double myDouble2 = 9.78;
        int myInt2 = (int) myDouble2; // Manual casting: double to int
        System.out.println(myDouble2);   // Outputs 9.78
        System.out.println(myInt2);      // Outputs 9
    }
}
/*In this example, `myInt` is automatically cast to a double for `myDouble`. For `myDouble2`,
        we manually cast it to an int for `myInt2`, which truncates the decimal part.

 */

