package src.JavaCourse.DSA.Arrays.TwoD;

import java.util.Scanner;

public class SearchInMatrix {

    public static boolean Searching(int[][] matrix, int search){
        int n=matrix.length, m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==search){
                    System.out.println("Element found at index at ith row & jth col: ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Element not found!");
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        int n = matrix.length, m = matrix[0].length;
        Scanner scanner = new Scanner(System.in);  // input like this: 1 2 3 4 5 6 7 8 9
        System.out.println("Enter the elements of matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter the element to be searched:");
        int search = scanner.nextInt();
        System.out.println("Matrix is: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        Searching(matrix, search);
    }
}