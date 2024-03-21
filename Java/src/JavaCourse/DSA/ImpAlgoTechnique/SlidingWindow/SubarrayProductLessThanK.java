package JavaCourse.DSA.ImpAlgoTechnique.SlidingWindow;
// 713. Subarray Product Less Than K.
//Given an array of positive integers nums and an integer k, return the number of subarrays where the product of all the elements in the subarray is strictly less than k.
//For example, given the input nums = [10, 5, 2, 6], k = 100, the answer is 8. The subarrays with products less than k are:
//[10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6]
public class SubarrayProductLessThanK {
    public static int numSubarrayProductLessThanK(int[] nums, int k){
        if(k <= 1 ){
            return 0;
        }
        int left =0;
        int currentProduct = 1;
        int ans = 0;
        for(int right = 0; right<nums.length;right++){
            currentProduct *= nums[right];
            while (currentProduct >= k){
                currentProduct /= nums[left];
                left++;
            }
            ans += right - left +1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {10, 5,2,6};
        int k = 100;
        int result = numSubarrayProductLessThanK(nums, k);
        System.out.println(result);
    }
}
