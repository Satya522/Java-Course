/*
Palindrome number: A palindrome number is a number that is same after reverse.
For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers. It can also be a string like LOL, MADAM etc.
 */

package src.JavaQA.NormalProgram;

import java.util.Scanner;

public class PalindromeNumber {

    public static void checkPalindrome(int number){
        int temp=number;
        int reverse=0;
        while(temp!=0)
        {
            int lastdigit=temp%10;
            reverse= reverse*10+lastdigit;
            temp /=10;
        }
        if(reverse==number)
        {
            System.out.println(number + " is a Palindrome number");
        }
        else {
            System.out.println(number + " is not a Palindrome number");
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number to check for palindrome:");
        int number = scanner.nextInt();
        checkPalindrome(number);
    }
}
