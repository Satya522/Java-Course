package JavaCourse.DSA.String;

import java.util.Scanner;

// Test cases
//input:"aaabbc" // Expected Output: a3b2c1
//input:"abcd"   // Expected Output: a1b1c1d1
//input:"zzzzz"  // Expected Output: z5
//input:"!@##$%"// Expected Output: !1@1#2$1%1
public class StringCompressor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(compressString(input));
    }

    public static String compressString(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        int count = 1;
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == input.charAt(i + 1)) {
                count++;
            } else {
                result.append(input.charAt(i)).append(count);
                count = 1;
            }
        }
        result.append(input.charAt(input.length() - 1)).append(count);
        return result.toString();
    }
}
