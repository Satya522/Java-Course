package src.JavaQA.GfG.DailyProblem;
/*
Given two integers s and d. The task is to find the smallest number such that the sum of its digits is s and the number
of digits in the number are d. Return a string that is the smallest possible number. If it is not possible then return -1.

Examples:

Input: s = 9, d = 2
Output: 18
Explanation: 18 is the smallest number possible with the sum of digits = 9 and total digits = 2.
Input: s = 20, d = 3
Output: 299
Explanation: 299 is the smallest number possible with the sum of digits = 20 and total digits = 3.
Expected Time Complexity: O(d)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ s ≤ 100
1 ≤ d ≤ 6


*/
public class SmallestNumber {
    public static String smallestNumber(int s, int d){
        if(s > 9*d || s==0){
            return "-1"; // not possible to form a number
        }
        char[] digits = new char[d];
        s -= 1; // Reverse 1 for the first digit to avoid leading zero
        for(int i=d-1;i>0;i--){
            if(s > 9){
                digits[i] = '9';
                s -= 9;
            }else {
                digits[i] = (char) (s+ '0');
                s = 0;
            }
        }
        digits[0] = (char) (s + '1'); // add 1 back to the first digit
        return new String(digits);
    }
    public static void main(String[] args) {
        System.out.println(smallestNumber(9,2));
        System.out.println(smallestNumber(20,3));
    }
}
