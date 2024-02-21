package JavaQA;
import java.util.Scanner;
public class PalindromeString {
    public static void main(String[] args) {

        String reverse = ""; // Objects of String class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string/number to check if it is a palindrome");
        String string = scanner.nextLine();
        int length = string.length();
        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + string.charAt(i);
        if (string.equals(reverse))
            System.out.println("Entered string/number is a palindrome.");
        else
            System.out.println("Entered string/number isn't a palindrome.");
    }
}
