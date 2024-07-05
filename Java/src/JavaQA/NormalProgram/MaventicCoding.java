package src.JavaQA.NormalProgram;
import java.util.Scanner;

public class MaventicCoding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.next();

        String output = replaceCharacters(input);
        System.out.println("Output: " + output);
    }

    public static String replaceCharacters(String input) {
        StringBuilder output = new StringBuilder();
        int vowelCount = 0;

        for (char c : input.toCharArray()) {
            if ("aeiou".indexOf(Character.toLowerCase(c)) != -1) {
                vowelCount++;
            } else {
                if (vowelCount == 1) {
                    output.append("1");
                } else if (vowelCount == 2) {
                    output.append("22");
                } else if (vowelCount == 3) {
                    output.append("333");
                }
                vowelCount = 0;
                output.append(c);
            }
        }

        // Handle the case where the string ends with a vowel sequence
        if (vowelCount == 1) {
            output.append("1");
        } else if (vowelCount == 2) {
            output.append("20");
        } else if (vowelCount == 3) {
            output.append("300");
        }

        return output.toString();
    }
}