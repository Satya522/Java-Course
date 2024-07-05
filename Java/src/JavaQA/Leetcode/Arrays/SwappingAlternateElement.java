package src.JavaQA.Leetcode.Arrays;

public class SwappingAlternateElement {
    public static void swapAlternate(int[] arr){
       int n = arr.length;
       for (int i=0; i<n-1;i+=2){
           int temp = arr[i];
           arr[i] = arr[i+1];
           arr[i+1] = temp;
       }
       for (int x: arr){
           System.out.print(x+" ");
       }

    }
    public static void main(String[] args) {
//        int[] arr = {1,4,3,2,7,8,5,9,6,10};
//        swapAlternate(arr);
        // Output: 4 1 2 3 8 7 9 5 10 6
        int[] arr1 = {1,4,3,2,7,8,5,9,6};
        // output: 4 1 2 3 8 7 9 5 6
        swapAlternate(arr1);
    }
}
