/*
In this solution we use kadane's algorithm to solve this problem and also optimize the time complexity of this
problem which is O(n) which is better than the brute force and prefix array approach.
 */
package JavaCourse.Arrays;
public class MaxSubArrayPairSum2 {

    public static void kadaneAlgorithm(int[] arr)
    {
        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            currentSum = currentSum+arr[i];
            if(currentSum<0){
                currentSum=0;
            }
            maxSum = Math.max(maxSum,currentSum);
        }
        System.out.println("Max Sum is: "+maxSum);
    }


    public static void main(String[] args) {
       int[] arr = {-2,-3,4,-1,-2,1,5,-3};
       kadaneAlgorithm(arr);

    }
}
