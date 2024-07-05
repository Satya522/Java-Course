package src.JavaQA.NormalProgram;

import java.util.Scanner;

public class Counter {

    static int count(int n){
        int count =0;
        while(n>0){
            n /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(count(n));
    }
}
