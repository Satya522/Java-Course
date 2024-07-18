package src.JavaCourse.DSA.Arrays.OneD;

import java.util.Arrays;

public class FindDuplicate {
    public static void findDuplicate(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
    public static void findDuplicateOptimized(int[] arr){
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] == arr[i+1]){
                System.out.println(arr[i]);
                break;
            }
        }
    }

    public static void main(String[] args) {
       int[] arr = {0,3,1,5,4,3,2};
       FindDuplicate.findDuplicate(arr);
//       FindDuplicate.findDuplicateOptimized(arr);
    }
}
