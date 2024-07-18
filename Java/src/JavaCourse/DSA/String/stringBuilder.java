package src.JavaCourse.DSA.String;

public class stringBuilder {
    public static void main(String[] args) {
        // StringBuilder is a mutable sequence of characters.
        // It is a dynamic array of characters.
        // It is similar to StringBuffer, but it is not thread-safe.
        // It is fast and efficient.
        // It is introduced in Java 5.0.
        // It is present in java.lang package.

        // StringBuilder is used when we have to perform a large number of string manipulations.
        // It is better to use StringBuilder when we have to perform a large number of string manipulations.

        // StringBuilder class is used to create mutable (modifiable) string.

        // StringBuilder is same as StringBuffer except for one difference that StringBuilder is not thread-safe.
        // It means two threads can call the methods of StringBuilder simultaneously.

        // StringBuilder class is used to create mutable (modifiable) string.
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb); // Hello

        // append() method
        // The append() method concatenates the given argument with this string.
        sb.append(" World");
        System.out.println(sb); // Hello World

        // insert() method
        // The insert() method inserts the given string with this string at the given position.
        sb.insert(5, " Java");
        System.out.println(sb); // Hello Java World

        // replace() method
        // The replace() method replaces the string from the specified beginIndex and endIndex.
        sb.replace(6, 10, "Python");
        System.out.println(sb); // Hello Python World

        // delete() method
        // The delete() method deletes the string from the specified beginIndex and endIndex.
        sb.delete(6, 13);
        System.out.println(sb); // Hello World

        // reverse() method
        // The reverse() method reverses the current string.
        sb.reverse();
        System.out.println(sb); // dlroW olleH
    }
}
