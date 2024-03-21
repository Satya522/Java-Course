package JavaQA;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers of terms: ");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count =2;
        System.out.println("Fibonacci series: ");
        System.out.print(a+ " " +b+ " ");
        while (count<=n){
            int temp = b;
            b = b+a;
            a = temp;
            System.out.print(b+ " ");
            count++;
        }
    }
}
