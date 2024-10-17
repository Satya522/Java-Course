package BinarySearch;
//leetcode Binary search Problems
//https://leetcode.com/problems/binary-search/?envType=study-plan-v2&envId=binary-search
public class BinarySearch {

    public static int search(int[] nums , int target){
        int start =0;
        int end = nums.length-1;
        while(start<=end){
            int mid = (start+ end)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                    start = mid+1;
            }
            else {
                    end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target =9;
        int result = search(nums,target);
        System.out.println("Target is found at index: "+result);

    }
}
