package src.JavaQA.Leetcode.Arrays;

import java.util.Arrays;

public class Sort01 {
    public static void sortZeroOne(int[] arr){
        int left =0;
        int right = arr.length-1;
        while (left<right){
            if(arr[left] == 1){
                if(arr[right] != 1){
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                }
                right--;            }
            else {
                left++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,1,0,1,0,1,0,1};
        sortZeroOne(arr);
        System.out.println(Arrays.toString(arr));
    }
}
