package src.JavaQA.ImpPattern.Advance;
/*
              print the following pattern
              1 2 3 4 5
              1 2 3 4
              1 2 3
              1 2
              1

*  */
public class InvertedHalfPyramidNumbers {
    public static void halfPyramidNumbers(int row, int colm){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        halfPyramidNumbers(5,5);
    }
}
