package JavaQA.Leetcode.Top150InterviewQuestion.ArraysStrings;

public class MergeTwoSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2,int n) {

        int[] result = new int[m+n];
        int pointer1 = 0, pointer2 = 0, pointer = 0;
        while (pointer1 < m && pointer2 < n) {
            if (nums1[pointer1] <= nums2[pointer2]) {
                result[pointer++] = nums1[pointer1++];
            } else {
                result[pointer++] = nums2[pointer2++];
            }
        }
        while (pointer1 < m) {
            result[pointer++] = nums1[pointer1++];
        }
        while (pointer2 < n) {
            result[pointer++] = nums2[pointer2++];
        }
        System.arraycopy(result, 0, nums1, 0, m + n);
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        merge(nums1, m, nums2,n);
        for(int num : nums1){
            System.out.print(num+" ");
        }

    }
}
