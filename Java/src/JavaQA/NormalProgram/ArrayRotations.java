package src.JavaQA.NormalProgram;

public class ArrayRotations {

    public static void reverse(int[] arr, int start,int end){
        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotateArray(int[] arr, int k){
        k = k% arr.length;
        if(k<0){
            k = k+ arr.length;
        }
        reverse(arr,0,k-1);
        reverse(arr, k, arr.length -1);
        reverse(arr, 0, arr.length -1);

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k=2;
       rotateArray(arr,k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
