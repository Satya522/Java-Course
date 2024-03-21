package JavaQA.Leetcode.Top150InterviewQuestion.ArraysStrings;

public class RemoveDuplicate2 {
    public static int removeDuplicate(int[] nums){
        if(nums.length == 0){
            return 0;
        }
        int count =0;
        for(int i=0;i<nums.length;i++){
            if(count<2 || nums[i]>nums[count-2]){
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        System.out.println(removeDuplicate(nums));
    }
}
