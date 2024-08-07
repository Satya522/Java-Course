package Arrays;
// https://leetcode.com/problems/three-consecutive-odds/description/?envType=daily-question&envId=2024-07-01
/*
Given an integer array arr, return true if there are three consecutive odd numbers in the array. Otherwise, return false.


Example 1:

Input: arr = [2,6,4,1]
Output: false
Explanation: There are no three consecutive odds.
Example 2:

Input: arr = [1,2,34,3,4,5,7,23,12]
Output: true
Explanation: [5,7,23] are three consecutive odds.


Constraints:

1 <= arr.length <= 1000
1 <= arr[i] <= 1000
*/
public class ThreeConsecutiveOdds {
    public static boolean threeConsecutiveOdds(int[] arr){
        int count =0; // for count the odd number
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
                if (count == 3){
                    return true;
                }
            }else {
                count = 0;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,34,3,4,5,7,23,12};
        System.out.println(threeConsecutiveOdds(arr));


    }
}
