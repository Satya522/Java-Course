package JavaQA.Leetcode.Numbers;

import java.util.Scanner;

// https://leetcode.com/problems/single-number/description/
public class SingleNumber {

    public int singleNumber(int[] nums){
        int result=0;
        for(int i=0;i<nums.length;i++){
            result = result^nums[i];
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter the element of array:");
        for(int i=0;i<size;i++){
            nums[i] = scanner.nextInt();
        }
      SingleNumber singleNumber = new SingleNumber();
        System.out.println(singleNumber.singleNumber(nums));

    }
}
