package src.JavaQA.GfG.ArrayQuestion;

public class MissingInArray {
    public  static int findMissingNumber(int[] arr, int n){
        int expectSum = n * (n+1) / 2;
        int actualSum = 0;
        for(int num: arr){
            actualSum += num;
        }
        return expectSum - actualSum;
    }

    public static void main(String[] args) {
        /*int n = 5;
        int[] arr = {1,2,3,5};*/
        int n = 2;
        int[] arr = {1};
        System.out.println("Missing number is: "+ findMissingNumber(arr,n));

    }
}
