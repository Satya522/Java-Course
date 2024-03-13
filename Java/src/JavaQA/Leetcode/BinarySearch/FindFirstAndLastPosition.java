package JavaQA.Leetcode.BinarySearch;

import java.util.EnumSet;

public class FindFirstAndLastPosition {
    public static int[] searchRange(int[] nums, int target){
        int[] result = new int[2];
        result[0] = findFirstPosition(nums,target);
        result[1] = findLastPosition(nums,target);
        return result;
    }
    public static int findFirstPosition(int[] nums,int target){
        int index =-1;
        int start=0;
        int end = nums.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid]>=target){
                end = mid-1;
            }else{
                start = mid+1;
            }
            if(nums[mid]==target){
                index=mid;
            }
        }
        return index;

    }

    public static int findLastPosition(int[] nums,int target){
        int index=-1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(nums[mid] <= target){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            if(nums[mid] == target)
                index = mid;
        }
        return index;
    }
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 6;
        int[] result = searchRange(nums,target);
        for (int i : result){
            System.out.print(i+" ");
        }

    }
}