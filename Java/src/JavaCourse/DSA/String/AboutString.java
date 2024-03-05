/*
In Java, a `String` is an object that represents a sequence of characters. The `java.lang.String` class is used to create a string object.

Here is a detailed explanation of the `String` class in Java:

1. **Immutability**: Strings in Java are immutable, which means once a `String` object is created, it cannot be changed.
 If you try to alter their values, another object gets created, and the original string object remains unchanged.

2. **String Literal**: Java String literal is created by using double quotes. For example: `String s="hello";`.
Each time you create a string literal, the JVM checks the string constant pool first. If the string already exists in the pool,
a reference to the pooled instance is returned. If the string doesn't exist in the pool, a new string instance is created and
placed in the pool.

3. **String Comparison**: The `String` class provides two methods for comparing strings:
   - `public boolean equals(Object another)`: compares this string to the specified object.
   - `public boolean equalsIgnoreCase(String another)`: compares this String to another String, ignoring case considerations.

4. **String Concatenation**: The `String` class in Java includes a method for concatenating two strings:
   - `public String concat(String str)`: concatenates the specified string to the end of this string.

5. **Substring**: The `String` class provides two methods to get substring from the string:
   - `public String substring(int beginIndex)`: returns a new string that is a substring of this string.
   - `public String substring(int beginIndex, int endIndex)`: returns a new string that is a substring of this string.

6. **Methods of String class**: The `String` class provides several methods to perform operations on strings such as
`compareTo()`, `concat()`, `isEmpty()`, `trim()`, `replace()`, `length()`, `charAt()`, `indexOf()`, `substring()`,
`split()`, `toLowerCase()`, `toUpperCase()`, etc.

7. **String Buffer and String Builder**: `StringBuffer` and `StringBuilder` in Java are used for creating mutable
 strings. `StringBuilder` is faster than `StringBuffer` because it's not thread-safe.

*/

package JavaCourse.DSA.String;
import java.lang.String;
public class AboutString {
    public static void main(String[] args) {
        // creating a string using literals
        String str = "Hello, World!";
        System.out.println(str);

        // creating a string using the new keyword
        String str1 = new String("Hello, World!");
        System.out.println(str1);

        // string comparison
        String str2 = "Hello";
        String str3 = "Hello";
        String str4 = new String("Hello");

        System.out.println(str2.equals(str3)); // true
        System.out.println(str2.equals(str4)); // true
        System.out.println(str2 == str3); // true
        System.out.println(str2 == str4); // false

        // string concatenation
        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1.concat(s2); // s3 = s1 + s2
        System.out.println(s3); // HelloWorld

        // substring
        String s4 = "Hello, World!";
        System.out.println(s4.substring(7)); // World!
        System.out.println(s4.substring(7, 12)); // World

        // length of a string
        String s5 = "Hello, World!";
        System.out.println(s5.length()); // 13

        // converting string to lowercase and uppercase
        String s6 = "Hello, World!";
        System.out.println(s6.toLowerCase()); // hello, world!
        System.out.println(s6.toUpperCase()); // HELLO, WORLD!

        // string buffer
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println(sb); // Hello World

        // string builder
        StringBuilder sb1 = new StringBuilder("Hello");
        sb1.append(" World");
        System.out.println(sb1); // Hello World
    }
}
