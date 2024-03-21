package JavaQA.Leetcode.Top150InterviewQuestion.ArraysStrings;

public class RemoveDuplicate {
    public static int removeDuplicate(int[] nums){
        if(nums.length==0){
            return 0;
        }
        int k = 0;
        for(int i=0;i<nums.length;i++){
           if(nums[k] != nums[i]){
               k++;
               nums[k] = nums[i];
           }
        }
        return k+1;
    }
    public static void main(String[] args) {
       int[] nums = {0,0,1,1,1,2,2,3,3,4};
       int result = removeDuplicate(nums);
        System.out.println(result);
    }
}
