package src.JavaCourse.DSA.Recursion;

public class PrintIncreasingDecreasing {
    // we can solve using iteration as well
    public static void printDecNumberIterative(int n){
        for (int i = n; i >= 1; i--) {
            System.out.print(i+" ");
        }
    }

    // This is a Recursive method to print number from 1 to n
    public static void printIncNumber(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printIncNumber(n-1);
        System.out.print(n+" ");
    }

    // This is Recursive Method to print numbers from n to 1
    public static void printDecNumber(int n){
        if(n==1) {
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        printDecNumber(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        printDecNumber(n);
        System.out.println();
        System.out.println();
        printIncNumber(n);

    }
}
