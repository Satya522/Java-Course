package src.JavaQA.ImpPattern.Advance;

/*
   print the following pattern
          *
        * *
      * * *
    * * * *
  * * * * *
 we call it inverted and rotated half pyramid


* */
public class InvertedAndRotatedHalfPyramid {
    public static void invertAndRotatedHalfPyramid(int row, int colm){
        for(int i=1;i<=row;i++){
            for (int j = 1; j <=colm ; j++) {
                if(j<=row-i){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int row = 5;
        int colm = 5;
        invertAndRotatedHalfPyramid(row,colm);
    }
}
