package src.JavaQA.NormalProgram;

public class SubArraySum {
    public static void subarraySum(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int currSum =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currSum = 0;
                for (int k = i; k <=j; k++) {
                    currSum += arr[k];
                }
                System.out.println(currSum);
                if(currSum>maxSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("MaxSum: "+maxSum);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,-1,5,-3,7};
        subarraySum(arr);

    }
}
