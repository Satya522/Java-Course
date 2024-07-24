package src.JavaQA.ImpPattern.Advance;
/*
    print the following pattern
                *         *
                **       **
                ***     ***             upper part
                ****   ****
                ***********
   ---------------------------------------------
                ***********
                ****   ****
                ***     ***              Lower part
                **       **
                *         *

           we call it butterfly pattern



   you can achieve this pattern by using two inverted half pyramid pattern
   one is normal and second is rotated and inverted half pyramid pattern

* */
public class Butterfly {
    public static void butterfly(int n){
        // Upper Part
        for(int i=1;i<=n;i++) {
            // 1st we print star
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            // we print space -- 2*(n-i)
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }
            // we print star
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

        // Lower Part
        for(int i=n;i>=1;i--){
            // we print star
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            // we print space -- 2*(n-i)
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }
            // we print star
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
       butterfly(5);
    }
}