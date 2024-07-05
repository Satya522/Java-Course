package src.JavaCourse.CoreJava.JavaBasic.DataType;

public class OperationOnCharacter {
    public static void main(String[] args) {
        char lowerCase = 'a';
        char UpperCase = 'A';
        char number = '1';
        char space = ' ';
        char Dollar = '$';
        char ch = '\u0040'; //  Unicode for @
        System.out.println(ch);
        char ch1 = 64;
        System.out.println(ch1);
        /*
        Retrieving subsequent characters
        There are two operators for adding (+) and subtracting (-) integer numbers
        in order to get the next and previous character according to the Unicode order.
         */

        char ch2 = 'b';
        ch2 += 1; // Increment by 1 --> c
        ch2 -= 2; // Decrement by 2 --> a
        System.out.println(ch2);
 //  It is also possible to add or subtract two characters
        char ch3 = 'b';
        ch3 += 'a';
        ch3 -= 'b';
        System.out.println(ch3);
    }
}
