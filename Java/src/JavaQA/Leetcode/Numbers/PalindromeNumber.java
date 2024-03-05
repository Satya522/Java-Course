package JavaQA.Leetcode.Numbers;

import java.util.Scanner;
/*
 https://leetcode.com/problems/palindrome-number/description/
 */
public class PalindromeNumber {

    // use this only isPalindrome method to solve your leetcode problem
    public boolean isPalindrome(int x){
        int reverse =0;
        if(x<0){
            return false;
        }
        else{

            int temp = x;
            while(temp!=0){
                reverse = reverse*10 + temp%10;
                temp /=10;
            }
        }
        return reverse == x;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        System.out.println(palindromeNumber.isPalindrome(number));
    }
}
