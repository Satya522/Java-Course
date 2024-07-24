package src.JavaQA.ImpPattern.Advance;

public class HollowRectangle {
    public static void hollowRectangle(int row, int colm){
        for (int i = 1; i <= row ; i++) {
            for (int j = 1; j <=colm; j++) {
                if(i==1 || j==1 || i==row || j==colm){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int row = 10;
        int colm = 5;
        hollowRectangle(row,colm);

    }

}
