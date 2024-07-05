package src.JavaQA.NormalProgram;

import java.util.Scanner;

public class TrailingZerosInFactorial {
    static int trailingZeros(int n){
        int result=0;
        int powerOf5=5;
        while(n<=powerOf5){
            result = result+ (n/powerOf5);
            powerOf5 = powerOf5*5;
        }
        return  result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(trailingZeros(n));
    }
}
