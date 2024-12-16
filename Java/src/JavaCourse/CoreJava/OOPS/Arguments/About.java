package src.JavaCourse.CoreJava.OOPS.Arguments;

public class About {
    /*
    Arguments: Whenever any we pass any data within the parenthesis while calling any method/function we say that we
    are passing an arguments.

    there is basically two types of arguments:
    1. Actual Arguments
    2. Formal Arguments

    1. Actual Arguments: The data which we pass within the parenthesis while calling any method/function is called
    actual arguments.

    2. Formal Arguments: The data which we receive in the method/function is called formal arguments.

    Example:
    public class About {
        public void add(int a, int b) {
            int sum = a + b;
            System.out.println("Sum is: " + sum);
        }
        public static void main(String[] args) {
            About obj = new About();
            obj.add(10, 20); // Actual Arguments
        }
    }

    In the above example, a and b are called formal arguments and 10 and 20 are called actual arguments.

    Types of Arguments Passing:
    1. Call by value
    2. Call by reference

    1. CALL BY VALUE: When ever we pass a value to a method/function, this value is actual argument value and this
    value is copied to the formal argument. So, the formal argument will have a copy of the actual argument value.
    so, if we change the value of the formal argument, it will not affect the actual argument value.

           Example:
    public class About {
        public void add(int a, int b) {
            a = 20;
            b = 30;
            int sum = a + b;
            System.out.println("Sum is: " + sum);
        }
        public static void main(String[] args) {
            About obj = new About();
            int x = 10;
            int y = 20;
            obj.add(x, y); // Actual Arguments
            System.out.println("x is: " + x + ", y is: " + y);
        }
    }

    In the above example, we are passing x and y as actual arguments and these values are copied to the formal
    arguments a and b. So, if we change the value of a and b, it will not affect the value of x and y.

    2. CALL BY REFERENCE: When ever we pass a reference to a method/function, this reference is actual argument
    reference and this reference is copied to the formal argument. So, the formal argument will have the same
    reference as the actual argument. So, if we change the value of the formal argument, it will affect the actual
    argument value.

    Example:
    public class About {
        public void add(int[] arr) {
            arr[0] = 20;
            arr[1] = 30;
            int sum = arr[0] + arr[1];
            System.out.println("Sum is: " + sum);
        }
        public static void main(String[] args) {
            About obj = new About();
            int[] arr = {10, 20};
            obj.add(arr); // Actual Arguments
            System.out.println("arr[0] is: " + arr[0] + ", arr[1] is: " + arr[1]);
        }
    }

    In the above example, we are passing arr as actual arguments and this reference is copied to the formal argument.
    So, if we change the value of the formal argument, it will affect the actual argument value.

    ***Very Important:
    --> IN JAVA WE HAVE ONLY ONE TYPE OF ARGUMENT PASSING AND THAT IS CALL BY VALUE.
    --> JAVA DOES NOT SUPPORT CALL BY REFERENCE.
    --> In java, we can pass just 2 types of arguments to a method:
    1. Variables(Primitive Data Types)
    2. Objects(Non-Primitive Data types)

    --> Both types of arguments are always passed using CALL BY VALUE.

    Rules to Pass Arguments in Java:
    1. The number of actual arguments should be equal to the number of formal arguments.
    2. The data type of actual arguments should be same as the data type of formal arguments.
    3. The sequence of the actual arguments should be same as the sequence of the formal arguments.
    4. The actual arguments should be passed in the same sequence as the formal arguments are defined.
    5. The actual arguments should be passed with in the parenthesis while calling the method.
    6. The actual arguments should be separated by commas.
    7. The actual arguments should be passed in the same sequence as the formal arguments are defined.
    8. The actual arguments should be passed with in the parenthesis while calling the method.
    9. The actual arguments should be separated by commas.

    Example:
    public class About {
        public void add(int a, int b) {
            int sum = a + b;
            System.out.println("Sum is: " + sum);
        }
        public static void main(String[] args) {
            About obj = new About();
            obj.add(10, 20); // Actual Arguments
        }
    }

    In the above example, we are passing 10 and 20 as actual arguments and these values are copied to the formal
    arguments a and b. So, the output will be Sum is: 30.

    Note: We can pass any number of arguments to a method but the number of actual arguments should be equal to the
    number of formal arguments.

    * */
}
