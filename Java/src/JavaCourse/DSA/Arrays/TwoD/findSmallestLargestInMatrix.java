package JavaCourse.DSA.Arrays.TwoD;

public class findSmallestLargestInMatrix {
    public static void findLargest(int[][] arr){
        int max = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
                if(arr[i][j]<smallest){
                    smallest=arr[i][j];
                }
            }
        }
        System.out.println("Smallest element in the matrix is: "+smallest);
        System.out.println("Largest Element in the matrix is: "+max);
    }
    public static void main(String[] args) {
      int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
      findLargest(arr);
    }
}
