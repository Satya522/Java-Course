package JavaCourse.DSA.ImpAlgoTechnique.SlidingWindow;
// Maximum Average Subarray: Given an array consisting of n integers, find the contiguous subarray of given length k
// that has the maximum average value. You need to output the maximum average value.
public class MaximumAvgSubArray {
    public static double findMaxAverage(int[] nums, int k){
           double sum = 0;
           for(int i=0;i<k;i++){
               sum += nums[i];
           }
           double result = sum;
           for(int i=k;i<nums.length;i++){
               sum += nums[i] - nums[i-k];
               result = Math.max(result,sum);
           }

           return  result/k;

    }
    public static void main(String[] args) {
        int[] arr = {1,12,-5,-6,50,3};
        int k = 4; // length of subarray
    }
}
