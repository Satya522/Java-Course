package src.JavaQA.ImpPattern.Advance;
/*
    print the following pattern
    1
    0 1
    1 0 1
    0 1 0 1
    1 0 1 0 1
    0 1 0 1 0 1

    we call it 01 Triangle

    we can solve this problem using two loops
    1. we create a matrix for visualization which is row and column, and then we can write the position of 0 and 1 in
           the matrix
    2 you can see (i,j) position of 0 and 1
    3. if position of i+j is even then we print 1 if it is odd then we print 0   --->  example: 0+0=0, 0+1=1, 0+2=2,
    0+3=3;




* */
public class ZeroOneTriangle {
    public static void zeroOneTriangle(int n){
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i ; j++) {
                if((i+j) % 2 == 1){
                    System.out.print("1 ");
                }else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        zeroOneTriangle(6);
    }
}
