//Ques: Write a Java program to count letters, spaces, numbers and other characters in an input string.
package JavaQA;

import java.util.Scanner;

public class CountString {

    public static void count(String input)
    {
        char[] chars = input.toCharArray();
        int letter =0;
        int space =0;
        int number=0;
        int others=0;

        for(int i=0;i<input.length();i++)
        {
            if(Character.isLetter(chars[i]))
            {
                letter++;
            }
            else if(Character.isDigit(chars[i]))
            {
                number++;
            } else if (Character.isSpaceChar(chars[i])) {

                space++;
            }
            else {
                others++;
            }

        }
        System.out.println("The number of letters is: " + letter);
        System.out.println("The number of spaces is: " + space);
        System.out.println("The number of numbers is: " + number);
        System.out.println("The number of other characters is: " + others);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Anything which you want to count: ");
        String input = scanner.nextLine();
        // input like this --:  hey hello buddy, I want give number 236587. and count ?? 25.33

        count(input);


    }
}
