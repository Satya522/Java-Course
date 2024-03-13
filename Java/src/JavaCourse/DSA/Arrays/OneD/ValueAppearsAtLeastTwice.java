package JavaCourse.DSA.Arrays.OneD;
/*
Question: Given an integers array nums, return true if any value appears at least twice in the array, and return false
if every element is distinct.
example: Input :   nums= [1,2,3,1]
         output:   true;
         Input :   nums = [1,2,3,4]
         output:   false;
*/
public class ValueAppearsAtLeastTwice {

    public static boolean containsDuplicate(int[] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
}
