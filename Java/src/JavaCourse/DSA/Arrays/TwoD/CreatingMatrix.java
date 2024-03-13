package JavaCourse.DSA.Arrays.TwoD;

import java.util.Scanner;

public class CreatingMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        int n=matrix.length, m=matrix[0].length;
        Scanner scanner = new Scanner(System.in);  // input like this: 1 2 3 4 5 6 7 8 9
        System.out.println("Enter the element of matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Matrix is:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
