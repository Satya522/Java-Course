package src.JavaQA.Leetcode.Arrays;

public class secondLargestElement {
    public static int findSecondLargest(int[] arr){
        int max,secondMax;
        max = secondMax = Integer.MIN_VALUE;
        for(int x:arr){
            if(x>max){
                secondMax = max;
                max = x;
            }else{
                if(x>secondMax && x!=max){
                    secondMax = x;
                }
            }
        }
        return secondMax;
    }
    public static void main(String[] args) {
        int[] arr = {12,35,1,12,5,7,8};

        System.out.println(findSecondLargest(arr));
    }
}
