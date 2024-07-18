package src.JavaQA.GfG.SchoolLevel;

import java.util.Scanner;

/*
You are given a number n. You need to print the pattern for the given value of n.
For n = 2 the pattern will be
2 2 1 1
2 1

For n = 3 the pattern will be
3 3 3 2 2 2 1 1 1
3 3 2 2 1 1
3 2 1
*/
public class PrintPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            for(int i=n;i>0;i--) {
                for (int j = n; j > 0; j--) {
                    for (int k = i; k > 0; k--) {
                        System.out.print(j + " ");
                    }
                }
                System.out.print("$");
            }
            scanner.close();
    }
}
