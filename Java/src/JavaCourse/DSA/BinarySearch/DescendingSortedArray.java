package src.JavaCourse.DSA.BinarySearch;

public class DescendingSortedArray {
    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            } else if (arr[mid] > target) {
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        int target = 3;
        System.out.println(binarySearch(arr, target));

    }
}
