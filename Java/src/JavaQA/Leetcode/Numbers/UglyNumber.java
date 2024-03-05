package JavaQA.Leetcode.Numbers;
// https://leetcode.com/problems/ugly-number/
// Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.
// Given an integer n, return true if n is an ugly number.
// Example 1:
// Input: n = 6
// Output: true
// Explanation: 6 = 2 × 3
// Example 2:
// Input: n = 8
// Output: true
// Explanation: 8 = 2 × 2 × 2
// Example 3:
// Input: n = 14
// Output: false
// Explanation: 14 is not ugly since it includes another prime factor 7
public class UglyNumber {
    public boolean isUgly(int num) {
        if (num <= 0) {
            return false;
        }
        int[] divisors = {2, 3, 5};
        for (int divisor : divisors) {
            while (num % divisor == 0) {
                num /= divisor;
            }
        }
        return num == 1;
    }

    public static void main(String[] args) {
        UglyNumber uglyNumber = new UglyNumber();
        System.out.println(uglyNumber.isUgly(6)); // Output: true
        System.out.println(uglyNumber.isUgly(8)); // Output: true
        System.out.println(uglyNumber.isUgly(14)); // Output: false
    }
}