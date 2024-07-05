package Arrays;

public class KadaneAlgorithm {
    public static long kadanes(long[] number){
        long currSum = 0;
        long maxSum = Long.MIN_VALUE;
        long maxElement = Long.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            currSum += number[i];
            if(currSum<0){
                currSum = 0;
            }
            maxSum = Math.max(currSum,maxSum);
            maxElement = Math.max(maxElement, number[i]);
        }
        return maxSum > 0 ? maxSum : maxElement;
    }

    public static void main(String[] args) {
        long[] number = {-2,-3,-4,-1,-2};
       long result =  kadanes(number);
        System.out.println(result);
    }
}
