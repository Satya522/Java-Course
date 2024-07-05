//Ques:Write a Java program to reverse a string.
package src.JavaQA.NormalProgram;
import java.lang.String;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        // Method 1 using StringBuilder
//        System.out.println("Enter a String: ");
//        String string = scanner.nextLine();
//        scanner.close();
//
//        StringBuilder stringBuilder = new StringBuilder(string);
//        String reversedString = stringBuilder.reverse().toString();
//
//        System.out.println("Reversed String: " + reversedString);
//

        // method 2 using charAt
        /*
        Get the string input from the user.
        Convert the string to a character array using the toCharArray() method.
        Initialize two pointers, one at the start of the array and one at the end.
        Swap the characters at the start and end pointers.
        Increment the start pointer and decrement the end pointer.
        Continue this process until the start pointer is greater than or equal to the end pointer.
        Convert the character array back to a string and print it.
       */
        System.out.println("Enter a String:");
        String string = scanner.nextLine();
        scanner.close();
        char[] charArray = string.toCharArray();  // convert string to char array
        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }

        String reversedString = new String(charArray);
        System.out.println("Reversed String: " + reversedString);

    }
}
