package JavaCourse.DSA.Arrays.TwoD;

public class SearchInSortedMatrix {
    public static boolean stairCaseSearch(int[][] matrix, int key){
      /*
      // Method Binary Search: O(nlogn)
      // is method me hum 32 ke special element manenge usi ke basic pe key ko find karenge
        int row= matrix.length-1;
        int col=0;
        while(row>=0 && col<matrix.length){
            if(matrix[row][col]==key){
                System.out.println("Element found at: ("+row+","+col+")");
                return true;
            }
            else if(matrix[row][col]>key){
                row--;
            }else{
                col++;
            }
        }
        System.out.println("Element not found");
        return false;
        */

        // is method me hum 40 ko special element man kar problem solve karenge
        int row =0;
        int col = matrix.length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("Element found at: ("+row+","+col+")");
                return true;
            }
            else if(matrix[row][col]>key){
                col--;
            }else {
                row++;
            }
        }
        System.out.println("Element not found!");
        return false;

    }
    public static void main(String[] args) {
        int[][] matrix = {
                {10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,50}
        };
        int key = 33;
        stairCaseSearch(matrix,key);
    }
}
