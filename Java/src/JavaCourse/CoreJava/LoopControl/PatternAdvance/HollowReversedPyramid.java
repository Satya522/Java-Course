package src.JavaCourse.CoreJava.JavaBasic.LoopControl.PatternAdvance;

public class HollowReversedPyramid {
    public static void main(String[] args) {
        int n = 5;
        int space = 0;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            space++;
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
