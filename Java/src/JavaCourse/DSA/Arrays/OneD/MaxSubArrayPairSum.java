// In This solution we use Brute Force approach to solve this problem
// Time Complexity of this Solution is O(n^3) which is very bad

package JavaCourse.DSA.Arrays.OneD;
public class MaxSubArrayPairSum {
    public static void maxSubArraySum(int[] arr){
        int maxSum =Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            int start = i;
            for (int j=i;j<arr.length;j++)
            {
                int end = j;
                int currentSum=0; // reset the value of currentSum to 0
                System.out.print("Subarray Pair: ");
                for(int k=start; k<=end;k++)
                {
                    currentSum += arr[k];
                    System.out.print(arr[k] + " ");
                }
                System.out.println("Sum: " + currentSum);
                if(currentSum>maxSum)
                {
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("max Sum is: "+maxSum);
    }
    public static void main(String[] args) {
        int[] arr = {1,-2,6,-1,3};
        maxSubArraySum(arr);
    }
}