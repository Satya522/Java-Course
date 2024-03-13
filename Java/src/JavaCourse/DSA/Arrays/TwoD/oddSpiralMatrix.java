package JavaCourse.DSA.Arrays.TwoD;

// odd means rows and columns are different like 3X3, 5X5, 7X7  etc.
public class oddSpiralMatrix {
    public static void printOddSpiral(int[][] arr){
        int sr=0,er= arr.length-1,sc=0,ec= arr[0].length-1; // sr= startRow , er = endingRow,sc= startColm,
        // ec=endingColm
        while(sr<=er && sc<=ec){
            // top boundary ke liye loop hai jisme i= row and j=colm mana liya hai
            for(int j=sc;j<=ec;j++){
                System.out.print(arr[sr][j]+" ");
            }
            // right boundary ke liye loop
            for(int i=sr+1;i<=er;i++){
                System.out.print(arr[i][ec]+" ");
            }
            // bottom ke liye loop
            for(int j=ec-1;j>=sc;j--){
                if(sr==er){
                    break;
                }
                System.out.print(arr[er][j]+" ");
            }
            for(int i=er-1;i>=sr+1;i--){
                if(sc==ec){
                    break;
                }
                System.out.print(arr[i][sc]+" ");
            }
            sr++;
            sc++;
            er--;
            ec--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        printOddSpiral(arr);
    }
}
