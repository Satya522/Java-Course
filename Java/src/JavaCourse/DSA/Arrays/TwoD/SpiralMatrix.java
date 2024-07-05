package src.JavaCourse.DSA.Arrays.TwoD;
// is method se tum kisi bhi type ka spiral matrix print kar sakte ho
public class SpiralMatrix {
    public static void printSpiral(int[][] arr){
        int startRow=0;
        int startCol=0;
        int endRow=arr.length-1;
        int endCol=arr[0].length-1;
        while(startRow<=endRow && startCol<=endCol){

            // top row elements
            for(int j=startCol;j<=endCol;j++){
                System.out.print(arr[startRow][j]+" ");
            }
            // right column elements
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(arr[i][endCol]+" ");
            }
            // bottom row elements
            if(startRow < endRow) {
                for(int j=endCol-1;j>=startCol;j--){
                    System.out.print(arr[endRow][j]+" ");
                }
            }
            // left column elements
            if(startCol < endCol) {
                for(int i=endRow-1;i>startRow;i--){
                    System.out.print(arr[i][startCol]+" ");
                }
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16},
                {17,18,19,20}
        };
        printSpiral(arr);
    }
}