package src.JavaCourse.CoreJava.JavaMethods.PracticeQuestionSolution;

public class MaxMinInArray {
    public static int findMax(int[] arr){
        int max = arr[0];
        for(int x: arr){
            if(x>max){
                max = x;
            }
        }
        return max;
    }
    public static int findMin(int[] arr){
        int min = arr[0];
        for(int x: arr){
            if(x<min){
                min = x;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {2,6,8,5,9};
        System.out.println("Max Value is:"+findMax(arr));
        System.out.println("Min Value is:"+findMin(arr));

    }
}
