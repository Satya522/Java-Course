package src.JavaCourse.DSA.Arrays.OneD;

public class rotateArray {
    public static void rotateOneTime(int[] arr){
        // ye sirf ek bar rotate karne ke liye hai
        int n = arr.length;
        int temp = arr[0];
        for(int i=1;i<n;i++){
             arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
    }  // Time Complexity: O(n)

    public  static void rotateNTimes(int[] arr, int k){
        // ye n bar ke liye hai lekin Tc = O(n*K) hai which is not good isliye hum isse better method ka use karenge
        int n = arr.length;
        k = k%n;
        if(k<0){
            k = k+n;
        }
        for (int i=1;i<=k;i++){
            rotateOneTime(arr);
        }
    }  // Time Complexity: O(n*k)

    public  static  void reverse(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
    }  // ye reverse method humne banaya hai taki hum array ko reverse kar sake
    public static void rotateArrayByReverse(int[] arr, int k){
        int n = arr.length;
        k = k%n;
        if(k<0){
            k = k+n;
        }
        reverse(arr, 0,k-1);
        reverse(arr, k,n-1);
        reverse(arr, 0,n-1);
    } // Time Complexity: O(n)


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 2;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
       rotateArrayByReverse(arr,k);
       for (int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
       }
        System.out.println();
    }
}
