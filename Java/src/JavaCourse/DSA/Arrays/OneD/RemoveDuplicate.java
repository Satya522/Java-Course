package src.JavaCourse.DSA.Arrays.OneD;

public class RemoveDuplicate {
    public static int removeDuplicate(int[] nums){
        if(nums.length == 0){
            return 0;
        }
        int i =0; // i is the index of the last unique element
        for (int j = 1; j < nums.length; j++) {
            if(nums[j] != nums[i]){
                // if the current element is not equal to the last unique element then we increment the index of last
                // unique element and swap the current element with the last unique element
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
        //
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,3,4,4,5,5};

    }
}
