//URL=https://leetcode.com/problems/split-the-array/
package JavaQA.Leetcode.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SplitArray {
    public boolean isPossible(int[] nums){
        Arrays.sort(nums);
        int distinctCount=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[i-1]){
                distinctCount++;
            }
        }
        printArray(nums);
        return distinctCount >=nums.length/2;
    }

    public static void printArray(int[] nums){
        for(int i=0;i< nums.length;i++){
            System.out.println(nums[i]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = scanner.nextInt();
        }
        SplitArray splitArray = new SplitArray();
        System.out.println(splitArray.isPossible(nums));
    }
}