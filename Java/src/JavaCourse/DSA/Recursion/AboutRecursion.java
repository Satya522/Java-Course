package src.JavaCourse.DSA.Recursion;
        /*
        Recursion is a fundamental concept in computer science and programming. It is a method of solving problems where the solution to a particular instance of a problem is derived from the solution of smaller instances of the same problem.

Here are some key points about recursion:

1. **Base Case**: Every recursive function must have a base case - a condition that stops the recursion.
Without a base case, a recursive function would run indefinitely.

2. **Recursive Case**: This is the part of the function that includes the recursive call. The recursive case is
designed in such a way that it makes the problem smaller with each recursive call.

3. **Call Stack**: When a recursive function is called, each call is placed on a call stack.
The call stack keeps track of what needs to be executed next. When a base case is reached,
the function returns its result, the stack begins to unwind, returning the result of each call.

4. **Direct and Indirect Recursion**: If a function calls itself, it's known as direct recursion.
If a function A calls another function B, which calls the first function A, it's known as indirect recursion.

5. **Tail Recursion**: If the recursive call is the last operation in the recursive function,
it's known as tail recursion. Some languages or compilers optimize tail recursion to make it more efficient.

6. **Recursion vs Iteration**: Both recursion and iteration are used for repeating operations,
but they do it in different ways. Iteration uses a loop structure, while recursion uses a function calling itself.
Recursion can be more intuitive for certain problems, but it can also lead to larger memory usage due to the call stack.

Here's a simple example of a recursive function in Java. This function calculates the factorial of a number:
*/
        public class AboutRecursion {
            public static void main(String[] args) {
                System.out.println(factorial(7));
            }

            public static int factorial(int n) {
                if (n == 0) { // base case
                    return 1;
                }  // recursive case
                    /*// fnm1 means factorial n-1 and fxn means function
                    int fnm1 =  factorial(n-1); // recursive call
                    int fxn =  n * factorial(n - 1);
                    return fxn;
                    OR
                    */
                return n * factorial(n-1);
            }
        }
/*
In this example, `factorial(n - 1)` is the recursive call. The base case is `n == 0`, at which point the function
returns `1`. For all other values of `n`, the function calls itself with the argument `n - 1`.
The result of this recursive call is then multiplied by `n` to give the factorial of `n`.
         */