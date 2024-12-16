package src.JavaCourse.CoreJava.JavaMethods.PracticeQuestionSolution;

import java.util.Scanner;

public class AverageOfArrayNumber {
    public static double average(int[] arr){
        double avg = 0;
        for(int x:arr){
            avg+=x;
        }
        return avg/arr.length;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of an array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Average of array Num is: "+average(arr));

    }
}
