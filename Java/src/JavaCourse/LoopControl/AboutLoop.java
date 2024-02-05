package JavaCourse.LoopControl;
/*
What is loops? why we used it? what is the type of loop?

Answer: Loop is a statement which executes a block of code repeatedly until a given condition is satisfied.
        we used loop to reduce the number of lines of code and we can do same thing in multiple times.
        There are three type of loop in java:
        1. for loop
        2. while loop
        3. do while loop

        for loop: for loop is used to iterate a part of the program several times. If the number of iteration is fixed,
        it is recommended to use for loop. There are three parts of for loop:
        1. initialization
        2. condition
        3. increment/decrement

        while loop: while loop is used to iterate a part of the program several times. If the number of iteration is not fixed,
        it is recommended to use while loop. There are three parts of while loop:
        1. initialization
        2. condition
        3. increment/decrement

        do while loop: do while loop is used to iterate a part of the program several times. If the number of iteration is not fixed,
        it is recommended to use do while loop. There are three parts of do while loop:
        1. initialization
        2. condition
        3. increment/decrement

        for each loop: for each loop is used to iterate a part of the program several times. If the number of iteration is not fixed,
        it is recommended to use for each loop. There are three parts of for each loop:
        1. initialization
        2. condition
        3. increment/decrement
 */
public class AboutLoop {
    public static void main(String[] args) {
        // Example of each loop
        int[] numbers = {1,2,3,4,5};
        for (int number:numbers) {
            System.out.println(number);
        }
        // Example of for loop
        for (int i = 1; i < 6; i++) {
            System.out.println(i);
        }
        // Example of while loop
        int j = 1;
        while (j < 6) {
            System.out.println(j);
            j++;
        }
        // Example of do while loop
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k < 6);
    }
}
