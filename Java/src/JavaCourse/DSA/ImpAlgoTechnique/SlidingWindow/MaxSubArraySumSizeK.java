package JavaCourse.DSA.ImpAlgoTechnique.SlidingWindow;
// Example 1: Given an array of positive integers nums and an integer k, find the length of the longest subarray whose
// sum is less than or equal to k. This is the problem we have been talking about above. We will now formally solve it.
public class MaxSubArraySumSizeK {
    public static  int findLength(int[] nums, int k){
        int left = 0;
        int currentSum = 0;
        int maxLength = 0;
        for(int right =0; right<nums.length;right++){
            currentSum += nums[right];
            while (currentSum > k){
                currentSum -= nums[left];
                left++;
            }
            maxLength = Math.max(maxLength, right-left+1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 7, 4, 2, 1, 1, 5};
        int k = 8;
        int result = findLength(nums, k);
        System.out.println(result);
    }
}
