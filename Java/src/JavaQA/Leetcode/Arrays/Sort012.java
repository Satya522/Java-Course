package Arrays;

import java.util.Arrays;

// You are given an array of 0s, 1s, and 2s. Sort the array in ascending order.
// Input: [0,1,2,0,1,2]
// Output: [0,0,1,1,2,2]
public class Sort012 {
    public static void sort012(int[] arr){
        int left =0;
        int right = arr.length-1;
        int mid = 0;
        while (mid<=right){
        if(arr[mid]==0){
            int temp = arr[left];
            arr[left] = arr[mid];
            arr[mid] = temp;
            left++;
            mid++;
        }else if(arr[mid] == 2){
            int temp = arr[mid];
            arr[mid] = arr[right];
            arr[right] = temp;
            right--;
        }else {
            mid++;
        }

        }
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,2,1,0};
        sort012(arr);
        System.out.println(Arrays.toString(arr));
    }
}
