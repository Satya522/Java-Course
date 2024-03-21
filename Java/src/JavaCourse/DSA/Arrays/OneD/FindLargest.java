package JavaCourse.DSA.Arrays.OneD;

public class FindLargest {
    public static int findLargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
            if(arr[i]<smallest){
                smallest = arr[i];
            }
        }
        System.out.println("Smallest: "+smallest);
        return largest;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 4, 5};
        int result = findLargest(arr);
        System.out.println("Largest: "+result);

    }
}
